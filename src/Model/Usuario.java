
package Model;

/**
 *
 * @author jhoda
 */
// quieres que te patee
public class Usuario {
    
    public Usuario LI;
    public int Cedula;
    public String Nombre;
    public String Apellidos;
    public String Sexo;
    public Usuario LD;

    public Usuario() {
        LI = null;
        LD = null;
    }

    public Usuario(Usuario user) {
        Cedula = user.Cedula;
        Nombre = user.Nombre;
        Sexo = user.Sexo;
        LI = null;
        LD = null;
    }
}
