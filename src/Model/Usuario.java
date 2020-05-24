
package Model;

/**
 *
 * @author jhoda
 */
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
// ricas nalgas bb
    public Usuario(Usuario user) {
        Cedula = user.Cedula;
        Nombre = user.Nombre;
        Sexo = user.Sexo;
        LI = null;
        LD = null;
    }
}
