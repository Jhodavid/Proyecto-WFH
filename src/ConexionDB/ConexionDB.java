
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
                int ruta = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Escoja la ruta de la base de dato:"
                                                                                + "\n1. Ruta de Poveda."
                                                                                + "\n2. Ruta de Guell."
                                                                                + "\n3. Ruta de Truyol."
                                                                                + "\n4. Ruta de Gaviria."
                                                                                + "\n5. Ruta de Restán."));
                String rutafile = "";
                
                switch(ruta){
                    case 1:
                        rutafile = "C:\\Users\\jhoda\\Documents\\NetBeansProjects\\Proyecto-WFH\\DateBaseWFH.accdb";
                        break;
                    case 2:
                        rutafile = "C:\\Users\\angel\\Documents\\NetBeansProjects\\Proyecto-WFH\\DateBaseWFH.accdb";
                        break;
                    case 3:
                        rutafile = "C:\\Users\\jhoda\\Documents\\NetBeansProjects\\Proyecto-WFH\\DateBaseWFH.accdb";
                        break;
                    case 4:
                        rutafile = "C:\\Users\\angel\\Documents\\NetBeansProjects\\Proyecto-WFH\\DateBaseWFH.accdb";
                        break;
                    case 5:
                        rutafile = "C:\\Users\\angel\\Documents\\NetBeansProjects\\Proyecto-WFH\\DateBaseWFH.accdb";
                        break;
                }
                
                
                //"
                //Tienen que cambiar la ruta por la de ustedes.
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
