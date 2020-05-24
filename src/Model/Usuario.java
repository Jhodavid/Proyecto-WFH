
package Model;

/**
 *
 * @author jhoda
 */
public class Usuario {
    
    public Usuario LI;
    public int Cedula;
    public String Nombre;
    public Usuario LD;

    public Usuario() {
        LI = null;
        LD = null;
    }

    public Usuario(Usuario user) {
        Cedula = user.Cedula;
        Nombre = user.Nombre;
        LI = null;
        LD = null;
    }
}
