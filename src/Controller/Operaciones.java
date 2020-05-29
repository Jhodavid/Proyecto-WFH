/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConexionDB.ConexionDB;
import Model.Usuario;
import java.sql.Connection;
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
    DefaultTableModel model = new DefaultTableModel();  
    Statement st = null;
    ResultSet rs = null;
    Connection con2 = null;
    String query;
    public Operaciones(){
        user = new Usuario();
    }
    
    public void Registar(String tabla,String campos,String valores){
     try {
         query="insert into "+tabla+" ("+campos+") values ("+valores+")";
         Connection con = null;
                ConexionDB conect = new ConexionDB();
                con = conect.getConnection();
                Statement st = con.createStatement();
                st.execute(query);
                JOptionPane.showMessageDialog(null, "Regitro guardado exitosamente");
    }
    catch(SQLException ex){
JOptionPane.showMessageDialog(null, "Error sql"+ex);
}
    }
    
    
  
    public Usuario iniciar(String inicio[]){
        
        try {
            Connection con1 = null;
            ConexionDB conect1 = new ConexionDB();
            con1 = conect1.getConnection();
            String sql = "select * from Usuario";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
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
}
