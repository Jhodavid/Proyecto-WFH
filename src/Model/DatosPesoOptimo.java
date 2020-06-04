
package Model;

/**
 *
 * @author jhoda
 */
public class DatosPesoOptimo {
    public Enfermedad LI;
    public int Dato;
    public Enfermedad LD;

    public DatosPesoOptimo() {
        LI = null;
        LD = null;
    }

    public DatosPesoOptimo(int dato) {
        Dato = dato;
        LI = null;
        LD = null;
    }
}
