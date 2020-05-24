
package ConexionDB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jhoda
 */

public class ConexionDB {

Connection ccn = null;
Statement st = null;

    public ConexionDB(){
        try 
            {
                String rutafile = "C:\\Users\\jhoda\\Documents\\NetBeansProjects\\Proyecto-WFH\\DateBaseWFH.accdb";
                //Tienen que cambiar la ruta por la de ustedes.C:\Users\jhoda\Documents\NetBeansProjects\Proyecto-WFH
                String Url = "jdbc:ucanaccess://" + rutafile;
                ccn = DriverManager.getConnection(Url);
                st = ccn.createStatement();
            } catch (SQLException e) 
                {
                    JOptionPane.showMessageDialog(null, "CONEXION ERRONEA " + e);  
                }
    }
    
    public Connection getConnection(){
        return ccn;
    }
    
    public void Desconexion(){
        try 
            {
                ccn.close();            
                System.exit(0);
            } catch (SQLException ex) 
                {
                    Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
}
