
package Model;


public class SaludFisica {
       public SaludFisica LI;
    public double IMC;
    public double TBM;
    public double Rc;
    public SaludFisica LD;

    public SaludFisica() {
        LI = null;
        LD = null;
    }

    public SaludFisica(SaludFisica datos) {
        IMC = datos.IMC;
        TBM = datos.TBM;
        Rc = datos.Rc;
        LI = null;
        LD = null;
    }
}
