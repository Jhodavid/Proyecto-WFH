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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhoda
 */
public class Operaciones {
    
    private Usuario user;
    DefaultTableModel model = new DefaultTableModel();  
    Statement st = null;
    ResultSet rs = null;
    Connection con2 = null;
    public Operaciones(){
        user = new Usuario();
    }
    
    public Usuario iniciar(String inicio[]){
        user = null;
        
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) JT_TablaHistorial.getModel();
            ConexionDB conect1 = new ConexionDB();
            con1 = conect1.getConnection();
            String dts[] = new String[12];
            String sql = "select * from registro";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dts[0] = rs.getString("Id_inventario");
                dts[1] = rs.getString("no_catalogo");
                dts[2] = rs.getString("marca");
                dts[3] = rs.getString("modelo");
                dts[4] = rs.getString("nombre");
                dts[5] = rs.getString("descripcion");               
                dts[6] = rs.getString("cantidad");
                dts[7] = rs.getString("ubicacion");
                dts[8] = rs.getString("Id_proveedores");
                dts[9] = rs.getString("nombre_proveedor");
                dts[10] = rs.getString("codigo");
                dts[11] = rs.getString("url");
                miModelo.addRow(dts);
            }

        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        return user;
    }
}
