/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConexionDB.ConexionDB;
import Model.DatosGrafica;
import Model.Usuario;
import Model.Enfermedad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhoda
 */
public class Operaciones {

    public static Usuario user;
    public Usuario userEstad;
    public DatosGrafica DatosGraf;
    public Enfermedad datosE;
    public Encriptacion en;

    DefaultTableModel model = new DefaultTableModel();
    Statement st = null;
    ResultSet rs = null;
    Connection con2 = null;
    String query;

    public Operaciones() {
        user = new Usuario();
        datosE = new Enfermedad();
        DatosGraf = new DatosGrafica();
        userEstad = new Usuario();
    }

    public void IniciarDatosGraf() {
        DatosGraf.PesoOptimo1 = 0;
        DatosGraf.PesoOptimo2 = 0;
        DatosGraf.PesoOptimo3 = 0;
        DatosGraf.PesoOptimo4 = 0;
        DatosGraf.PesoOptimo5 = 0;
        DatosGraf.PesoOptimo6 = 0;
        DatosGraf.PesoOptimo7 = 0;
        DatosGraf.PesoOptimo8 = 0;
        DatosGraf.PesoOptimo9 = 0;
        DatosGraf.SobrePeso1 = 0;
        DatosGraf.SobrePeso2 = 0;
        DatosGraf.SobrePeso3 = 0;
        DatosGraf.SobrePeso4 = 0;
        DatosGraf.SobrePeso5 = 0;
        DatosGraf.SobrePeso6 = 0;
        DatosGraf.SobrePeso7 = 0;
        DatosGraf.SobrePeso8 = 0;
        DatosGraf.SobrePeso9 = 0;
        DatosGraf.PorDebajo1 = 0;
        DatosGraf.PorDebajo2 = 0;
        DatosGraf.PorDebajo3 = 0;
        DatosGraf.PorDebajo4 = 0;
        DatosGraf.PorDebajo5 = 0;
        DatosGraf.PorDebajo6 = 0;
        DatosGraf.PorDebajo7 = 0;
        DatosGraf.PorDebajo8 = 0;
        DatosGraf.PorDebajo9 = 0;
    }

    public void Registar(String tabla, String campos, String valores) {
        try {
            query = "insert into " + tabla + " (" + campos + ") values (" + valores + ")";
            Connection con = null;
            ConexionDB conect = new ConexionDB();
            con = conect.getConnection();
            Statement st = con.createStatement();
            st.execute(query);
            JOptionPane.showMessageDialog(null, "Regitro guardado exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql" + ex);
        }
    }

    public void Actualizar(Usuario Actualizar) {
        try {
            Connection con = null;
            ConexionDB conect1 = new ConexionDB();
            con = conect1.getConnection();
            Statement st = con.createStatement();
            String sql = "update Usuario set Cedula = ?, Contraseña = ?, Nombre = ?, Apellidos = ?, Sexo = ?, Telefono = ?, Edad = ?, Altura = ?, Peso = ? where IdUsuario = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Actualizar.Cedula);
            pst.setString(2, Actualizar.Contraseña);
            pst.setString(3, Actualizar.Nombre);
            pst.setString(4, Actualizar.Apellidos);
            pst.setString(5, Actualizar.Sexo);
            pst.setInt(6, Actualizar.Telefono);
            pst.setInt(7, Actualizar.Edad);
            pst.setDouble(8, Actualizar.Altura);
            pst.setDouble(9, Actualizar.Peso);
            pst.setInt(10, Actualizar.IdUsuario);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error sql" + ex);    
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR MIENTRAS SE ACTULIZABAN SUS DATOS", "Error " + ex, javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    ///////////////METODOS INICIO - ADMIN - ENFERMEDADES - ESTADISTICAS
    public Usuario iniciar(String inicio[]) {

        try {
            Connection con1 = null;
            ConexionDB conect1 = new ConexionDB();
            con1 = conect1.getConnection();
            String sql = "select * from Usuario";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                user.IdUsuario = Integer.parseInt(rs.getString("IdUsuario"));
                user.Cedula = Integer.parseInt(rs.getString("Cedula"));
                user.Contraseña = (rs.getString("Contraseña"));
                user.Nombre = rs.getString("Nombre");
                user.Apellidos = rs.getString("Apellidos");
                user.Sexo = rs.getString("Sexo");
                user.Telefono = Integer.parseInt(rs.getString("Telefono"));
                user.Edad = Integer.parseInt(rs.getString("Edad"));
                user.Altura = Double.parseDouble(rs.getString("Altura"));
                user.Peso = Double.parseDouble(rs.getString("Peso"));

                if (Integer.toString(user.Cedula).equals(inicio[0]) && user.Contraseña.equals(inicio[1])) {
                    return user;
                }
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public void GuardarSintomas(String sintoma) {

        try {
            query = "insert into Sintomas (Nombre) values ('" + sintoma + "')";
            Connection con = null;
            ConexionDB conect = new ConexionDB();
            con = conect.getConnection();
            Statement st = con.createStatement();
            st.execute(query);
            JOptionPane.showMessageDialog(null, "Regitro guardado exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql" + ex);
        }
    }

    public void GuardarEnfermedades(Enfermedad datos) {
        try {
            query = "insert into Enfermedades (Nombre, Descripcion, TipoEnfermedad, Sintomas) values ('" + datos.Tipo + "', '" + datos.Descripcion + "', '" + datos.Tipo + "', '" + datos.Sintomas + "')";
            Connection con = null;
            ConexionDB conect = new ConexionDB();
            con = conect.getConnection();
            Statement st = con.createStatement();
            st.execute(query);
            JOptionPane.showMessageDialog(null, "Regitro guardado exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql" + ex);
        }
    }

    public Enfermedad Enfermedades(String nombre) {

        try {
            Connection con1 = null;
            ConexionDB conect1 = new ConexionDB();
            con1 = conect1.getConnection();
            String sql = "select * from Enfermedades";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                if (nombre.equals(rs.getString("Nombre"))) {
                    datosE.IdEnfermedad = Integer.parseInt(rs.getString("IdEnfermedades"));
                    datosE.Titulo = rs.getString("Nombre");
                    datosE.Tipo = rs.getString("TipoEnfermedad");
                    datosE.Descripcion = rs.getString("Descripcion");
                    datosE.Sintomas = rs.getString("Sintomas");

                    return datosE;
                }
            }

        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public void ImformeEnfermedad(int IdEnfermedad, int IdUsuario) {
        try {
            System.out.println(IdUsuario + " -- " + IdEnfermedad);
            query = "insert into Informe_Enfermedades (IdUsuario, IdEnfermedades) values ('" + IdUsuario + "', '" + IdEnfermedad + "')";
            Connection con = null;
            ConexionDB conect = new ConexionDB();
            con = conect.getConnection();
            Statement st = con.createStatement();
            st.execute(query);
            JOptionPane.showMessageDialog(null, "Regitro guardado exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql" + ex);
        }
    }

    public void GuardarSaludFisica(Usuario Actualizar) {
        try {
            Connection con = null;
            ConexionDB conect1 = new ConexionDB();
            con = conect1.getConnection();
            Statement st = con.createStatement();
            String sql = "update Usuario set PesoOptimo = ?, RitmoCardiaco = ?, CaloriasDiarias = ? where IdUsuario = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setDouble(1, Actualizar.PesoOptimo);
            pst.setDouble(2, Actualizar.RitmoCardiaco);
            pst.setDouble(3, Actualizar.CaloriasDiarias);
            pst.setInt(4, Actualizar.IdUsuario);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error sql" + ex);    
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR MIENTRAS SE ACTULIZABAN SUS DATOS", "Error " + ex, javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    public DatosGrafica GraficaPesos() {
        IniciarDatosGraf();
        try {
            Connection con1 = null;
            ConexionDB conect1 = new ConexionDB();
            con1 = conect1.getConnection();
            String sql = "select * from Usuario";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                userEstad.IdUsuario = Integer.parseInt(rs.getString("IdUsuario"));
                userEstad.Cedula = Integer.parseInt(rs.getString("Cedula"));
                userEstad.Contraseña = rs.getString("Contraseña");
                userEstad.Nombre = rs.getString("Nombre");
                userEstad.Apellidos = rs.getString("Apellidos");
                userEstad.Sexo = rs.getString("Sexo");
                userEstad.Telefono = Integer.parseInt(rs.getString("Telefono"));
                userEstad.Edad = Integer.parseInt(rs.getString("Edad"));
                userEstad.Altura = Double.parseDouble(rs.getString("Altura"));
                userEstad.Peso = Double.parseDouble(rs.getString("Peso"));
                userEstad.PesoOptimo = Double.parseDouble(rs.getString("Peso Optimo"));
                userEstad.CaloriasDiarias = Double.parseDouble(rs.getString("CaloriasDiarias"));
                userEstad.RitmoCardiaco = Double.parseDouble(rs.getString("Ritmo Cardiaco"));

                if (userEstad.Edad < 11) {
                    if (userEstad.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo1++;
                    } else if (userEstad.PesoOptimo >= 18.5 && userEstad.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo1++;
                    } else if (userEstad.PesoOptimo > 25) {
                        DatosGraf.SobrePeso1++;
                    }
                } else if (userEstad.Edad >= 11 && userEstad.Edad < 20) {
                    if (userEstad.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo2++;
                    } else if (userEstad.PesoOptimo >= 18.5 && userEstad.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo2++;
                    } else if (userEstad.PesoOptimo > 25) {
                        DatosGraf.SobrePeso2++;
                    }
                } else if (userEstad.Edad >= 20 && userEstad.Edad < 30) {
                    if (userEstad.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo3++;
                    } else if (userEstad.PesoOptimo >= 18.5 && userEstad.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo3++;
                    } else if (userEstad.PesoOptimo > 25) {
                        DatosGraf.SobrePeso3++;
                    }
                } else if (userEstad.Edad >= 30 && userEstad.Edad < 40) {
                    if (userEstad.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo4++;
                    } else if (userEstad.PesoOptimo >= 18.5 && userEstad.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo4++;
                    } else if (userEstad.PesoOptimo > 25) {
                        DatosGraf.SobrePeso4++;
                    }
                } else if (userEstad.Edad >= 40 && userEstad.Edad < 50) {
                    if (userEstad.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo5++;
                    } else if (userEstad.PesoOptimo >= 18.5 && userEstad.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo5++;
                    } else if (userEstad.PesoOptimo > 25) {
                        DatosGraf.SobrePeso5++;
                    }
                } else if (userEstad.Edad >= 50 && userEstad.Edad < 60) {
                    if (userEstad.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo6++;
                    } else if (userEstad.PesoOptimo >= 18.5 && userEstad.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo6++;
                    } else if (userEstad.PesoOptimo > 25) {
                        DatosGraf.SobrePeso6++;
                    }
                } else if (userEstad.Edad >= 60 && userEstad.Edad < 70) {
                    if (userEstad.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo7++;
                    } else if (userEstad.PesoOptimo >= 18.5 && userEstad.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo7++;
                    } else if (userEstad.PesoOptimo > 25) {
                        DatosGraf.SobrePeso7++;
                    }
                } else if (userEstad.Edad >= 70 && userEstad.Edad < 80) {
                    if (userEstad.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo8++;
                    } else if (userEstad.PesoOptimo >= 18.5 && userEstad.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo8++;
                    } else if (userEstad.PesoOptimo > 25) {
                        DatosGraf.SobrePeso8++;
                    }
                } else if (userEstad.Edad >= 80) {
                    if (userEstad.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo9++;
                    } else if (userEstad.PesoOptimo >= 18.5 && userEstad.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo9++;
                    } else if (userEstad.PesoOptimo > 25) {
                        DatosGraf.SobrePeso9++;
                    }
                }
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        return DatosGraf;
    }

    ////////////////////////////////////////////////////////////////////////////
    // ________________________________________________________________________________ graficar 
    public void graficar(Usuario dato) {

    }
    /////// SALUD FISICA !!!!!!!!!!!!!!!!!!!!! ///////////////////////////////////////////////////////////

    public double PesoOptimo(double cm, double ps) {
        double mt = cm / 100;
        return ps / (Math.pow(mt, 2));
    }
    //------- Calorias ---------------------------------------------  

    public double CaloriasF(double kg, double Alt, double Ed) {
        Double TBM;
        TBM = ((10 * kg) + (6.25 * Alt) - (5 * Ed) - 161);
        return TBM;
    }

    public double CaloriasM(double kg, double Alt, double Ed) {
        Double TBM;
        TBM = ((10 * kg) + (6.25 * Alt) - (5 * Ed) + 5);
        return TBM;
    }

}
