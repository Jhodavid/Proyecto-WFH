
package Model;

/**
 *
 * @author poveda la chupa
 */

public class Usuario {
    
    public Usuario LI;
    public int IdUsuario;
    public int Cedula;
    public String Contraseña;
    public String Nombre;
    public String Apellidos;
    public String Sexo;
    public int Telefono;
    public int Edad;
    public double Altura;
    public double Peso;
    public Usuario LD;

    public Usuario() {
        LI = null;
        LD = null;
    }

    public Usuario(Usuario user) {
        IdUsuario = user.IdUsuario;
        Cedula = user.Cedula;
        Nombre = user.Nombre;
        Apellidos = user.Apellidos;
        Sexo = user.Sexo;
        Telefono = user.Telefono;
        Edad = user.Edad;
        Altura = user.Altura;
        Altura = user.Peso;
        LI = null;
        LD = null;
    }
}
