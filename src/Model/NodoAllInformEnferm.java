
package Model;

/**
 *
 * @author jhoda
 */
public class NodoAllInformEnferm {
    public int IdInforme;
    public int IdUsuario;
    public int IdEnfermedad;
    public String NombreEnfer;
    public int EdadUsuario;
    public NodoAllInformEnferm Sig;

    public NodoAllInformEnferm() {
        Sig = null;
    }

    public NodoAllInformEnferm(NodoAllInformEnferm datos) {
        IdInforme = datos.IdInforme;
        IdUsuario = datos.IdUsuario;
        IdEnfermedad = datos.IdEnfermedad;
        NombreEnfer = datos.NombreEnfer;
        EdadUsuario = datos.EdadUsuario;
        Sig = null;
    }
}
