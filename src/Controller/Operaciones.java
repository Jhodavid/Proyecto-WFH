/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConexionDB.ConexionDB;
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
    public Enfermedad datosE;
    
    DefaultTableModel model = new DefaultTableModel();
    Statement st = null;
    ResultSet rs = null;
    Connection con2 = null;
    String query;

    public Operaciones() {
        user = new Usuario();
        datosE = new Enfermedad();
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

    public void Actualizar(String v[]) {

        try {
            Connection con = null;
            ConexionDB conect1 = new ConexionDB();
            con = conect1.getConnection();
            Statement st = con.createStatement();
            String sql = "update Usuario set Cedula = ?, Contraseña = ?, Nombre = ?, Apellidos = ?, Sexo = ?, Telefono = ?, Edad = ?, Altura = ?, Peso = ? where IdUsuario = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, v[2]);
            pst.setString(2, v[4]);
            pst.setString(3, v[0]);
            pst.setString(4, v[1]);
            pst.setString(5, v[8]);
            pst.setString(6, v[3]);
            pst.setString(7, v[5]);
            pst.setString(8, v[7]);
            pst.setString(9, v[6]);
            pst.setInt(10, Integer.parseInt(v[9]));

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error sql" + ex);    
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR MIENTRAS SE ACTULIZABAN SUS DATOS", "Error " + ex, javax.swing.JOptionPane.ERROR_MESSAGE);

        }

    }

    ///////////////METODOS INICIO - ADMIN - ENFERMEDADES
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
                user.Contraseña = rs.getString("Contraseña");
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
    
    public void ImformeEnfermedad(int IdEnfermedad){
        try {
            query = "insert into Informe_Enfermedades (IdUsuario, IdEnfermedades) values ('" + user.IdUsuario + "', '" + datosE.IdEnfermedad + "')";
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

    ////////////////////////////////////////////////////////////////////////////
    // ________________________________________________________________________________ graficar 
    public void graficar(Usuario dato) {

    }

}
