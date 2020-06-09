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
import Model.NodoAllInformEnferm;
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

    public Usuario user;
    public Usuario userEstad;
    public static DatosGrafica DatosGraf, GrafEnfer;
    public Enfermedad datosE;
    public Encriptacion en;
    NodoAllInformEnferm userEnfer = new NodoAllInformEnferm();
    public static NodoAllInformEnferm ConsultInforme = new NodoAllInformEnferm();

    DefaultTableModel model = new DefaultTableModel();
    Statement st = null;
    ResultSet rs = null;
    Connection con2 = null;
    String query;

    public Operaciones() {
        user = new Usuario();
        datosE = new Enfermedad();
        DatosGraf = new DatosGrafica();
        GrafEnfer = new DatosGrafica();
        userEstad = new Usuario();
        userEnfer = null;
    }
    
    public void blanco(){
        GrafEnfer.Enfermedad1 = 0;
        GrafEnfer.Enfermedad2 = 0;
        GrafEnfer.Enfermedad3 = 0;
        GrafEnfer.Enfermedad4 = 0;
        GrafEnfer.Enfermedad5 = 0;
        GrafEnfer.Enfermedad6 = 0;
        GrafEnfer.Enfermedad7 = 0;
        GrafEnfer.Enfermedad8 = 0;
        GrafEnfer.Enfermedad9 = 0;
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
                user.PesoOptimo = Double.parseDouble(rs.getString("PesoOptimo"));
                user.RitmoCardiaco = Double.parseDouble(rs.getString("RitmoCardiaco"));
                user.CaloriasDiarias = Double.parseDouble(rs.getString("CaloriasDiarias"));

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

    public void ImformeEnfermedad(int IdEnfermedad, int IdUsuario, int EdadUsuario, String NombreEnfermedada) {
        try {
            System.out.println(IdUsuario + " -- " + IdEnfermedad);
            query = "insert into Informe_Enfermedades (IdUsuario, IdEnfermedades, EdadUsuario, NombreEnfermedada) values ('" + IdUsuario + "', '" + IdEnfermedad + "', '" + EdadUsuario + "', '" + NombreEnfermedada + "')";
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

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error sql" + ex);    
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR MIENTRAS SE ACTULIZABAN SUS DATOS", "Error " + ex, javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    public DatosGrafica GraficaPesos() {
        try {
            Connection con1 = null;
            ConexionDB conect1 = new ConexionDB();
            con1 = conect1.getConnection();
            String sql = "select * from Usuario";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                user.Edad = Integer.parseInt(rs.getString("Edad"));
                user.PesoOptimo = Double.parseDouble(rs.getString("PesoOptimo"));

                if (user.Edad < 11) {
                    if (user.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo1++;
                    } else if (user.PesoOptimo >= 18.5 && user.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo1++;
                    } else if (user.PesoOptimo > 25) {
                        DatosGraf.SobrePeso1++;
                    }
                } else if (user.Edad >= 11 && user.Edad < 20) {
                    if (user.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo2++;
                    } else if (user.PesoOptimo >= 18.5 && user.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo2++;
                    } else if (user.PesoOptimo > 25) {
                        DatosGraf.SobrePeso2++;
                    }
                } else if (user.Edad >= 20 && user.Edad < 30) {
                    if (user.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo3++;
                    } else if (user.PesoOptimo >= 18.5 && user.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo3++;
                    } else if (user.PesoOptimo > 25) {
                        DatosGraf.SobrePeso3++;
                    }
                } else if (user.Edad >= 30 && user.Edad < 40) {
                    if (user.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo4++;
                    } else if (user.PesoOptimo >= 18.5 && user.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo4++;
                    } else if (user.PesoOptimo > 25) {
                        DatosGraf.SobrePeso4++;
                    }
                } else if (user.Edad >= 40 && user.Edad < 50) {
                    if (user.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo5++;
                    } else if (user.PesoOptimo >= 18.5 && user.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo5++;
                    } else if (user.PesoOptimo > 25) {
                        DatosGraf.SobrePeso5++;
                    }
                } else if (user.Edad >= 50 && user.Edad < 60) {
                    if (user.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo6++;
                    } else if (user.PesoOptimo >= 18.5 && user.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo6++;
                    } else if (user.PesoOptimo > 25) {
                        DatosGraf.SobrePeso6++;
                    }
                } else if (user.Edad >= 60 && user.Edad < 70) {
                    if (user.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo7++;
                    } else if (user.PesoOptimo >= 18.5 && user.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo7++;
                    } else if (user.PesoOptimo > 25) {
                        DatosGraf.SobrePeso7++;
                    }
                } else if (user.Edad >= 70 && user.Edad < 80) {
                    if (user.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo8++;
                    } else if (user.PesoOptimo >= 18.5 && user.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo8++;
                    } else if (user.PesoOptimo > 25) {
                        DatosGraf.SobrePeso8++;
                    }
                } else if (user.Edad >= 80) {
                    if (user.PesoOptimo < 18.5) {
                        DatosGraf.PorDebajo9++;
                    } else if (user.PesoOptimo >= 18.5 && user.PesoOptimo <= 25) {
                        DatosGraf.PesoOptimo9++;
                    } else if (user.PesoOptimo > 25) {
                        DatosGraf.SobrePeso9++;
                    }
                }
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        return DatosGraf;
    }

    public void InsertarInicio(NodoAllInformEnferm dato) {
        NodoAllInformEnferm x = new NodoAllInformEnferm(dato);
        x.Sig = userEnfer;
        userEnfer = x;
    }

    //////////LLENADO DEL NODO DEL INFORME DE LAS ENFERMEDADES//////////////////
    public DatosGrafica GraficaEnfermedades(String NombreEnfermedad) {
        blanco();
        try {
            Connection con1 = null;
            ConexionDB conect1 = new ConexionDB();
            con1 = conect1.getConnection();
            String sql = "select * from Informe_Enfermedades";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                    ConsultInforme.IdInforme = Integer.parseInt(rs.getString("IdInforme_Enfermedades"));
                    ConsultInforme.IdUsuario = Integer.parseInt(rs.getString("IdUsuario"));
                    ConsultInforme.IdEnfermedad = Integer.parseInt(rs.getString("IdEnfermedades"));
                    ConsultInforme.EdadUsuario = Integer.parseInt(rs.getString("EdadUsuario"));
                    ConsultInforme.NombreEnfer = rs.getString("NombreEnfermedada");
                    InsertarInicio(ConsultInforme);                   
                if (ConsultInforme.NombreEnfer.equals(NombreEnfermedad)) {
                    if (ConsultInforme.EdadUsuario < 11) {
                        GrafEnfer.Enfermedad1++;
                    } else if (ConsultInforme.EdadUsuario >= 11 && ConsultInforme.EdadUsuario < 20) {
                        GrafEnfer.Enfermedad2++;
                    } else if (ConsultInforme.EdadUsuario >= 20 && ConsultInforme.EdadUsuario < 30) {
                        GrafEnfer.Enfermedad3++;
                    } else if (ConsultInforme.EdadUsuario >= 30 && ConsultInforme.EdadUsuario < 40) {
                        GrafEnfer.Enfermedad4++;
                    } else if (ConsultInforme.EdadUsuario >= 40 && ConsultInforme.EdadUsuario < 50) {
                        GrafEnfer.Enfermedad5++;
                    } else if (ConsultInforme.EdadUsuario >= 50 && ConsultInforme.EdadUsuario < 60) {
                        GrafEnfer.Enfermedad6++;
                    } else if (ConsultInforme.EdadUsuario >= 60 && ConsultInforme.EdadUsuario < 70) {
                        GrafEnfer.Enfermedad7++;
                    } else if (ConsultInforme.EdadUsuario >= 70 && ConsultInforme.EdadUsuario < 80) {
                        GrafEnfer.Enfermedad8++;
                    } else if (ConsultInforme.EdadUsuario >= 80) {
                        GrafEnfer.Enfermedad9++;
                    }
                }
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        ////////////////////////////////////////////////////////////////////////
        return GrafEnfer;
    }
    
    public NodoAllInformEnferm InformeEnfer(int idUser){
        NodoAllInformEnferm tInforme = new NodoAllInformEnferm();
        try {
            Connection con1 = null;
            ConexionDB conect1 = new ConexionDB();
            con1 = conect1.getConnection();
            String sql = "select * from Informe_Enfermedades";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                if(idUser == Integer.parseInt(rs.getString("IdUsuario"))){
                    tInforme.IdInforme = Integer.parseInt(rs.getString("IdInforme_Enfermedades"));
                    tInforme.IdUsuario = Integer.parseInt(rs.getString("IdUsuario"));
                    tInforme.IdEnfermedad = Integer.parseInt(rs.getString("IdEnfermedades"));
                    tInforme.EdadUsuario = Integer.parseInt(rs.getString("EdadUsuario"));
                    tInforme.NombreEnfer = rs.getString("NombreEnfermedada");
                    NodoAllInformEnferm x = new NodoAllInformEnferm();
                    x.Sig = tInforme;
                    tInforme = x; 
                }                 
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        ////////////////////////////////////////////////////////////////////////
        return tInforme;
    }
    
    ////////////////////////////////////////////////////////////////////////////
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
