/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jhoda
 */
public class DatosGrafica {
    
    public Enfermedad LI;
    public int PesoOptimo1;
    public int PesoOptimo2;
    public int PesoOptimo3;
    public int PesoOptimo4;
    public int PesoOptimo5;
    public int PesoOptimo6;
    public int PesoOptimo7;
    public int PesoOptimo8;
    public int PesoOptimo9;
    
    public int SobrePeso1;
    public int SobrePeso2;
    public int SobrePeso3;
    public int SobrePeso4;
    public int SobrePeso5;
    public int SobrePeso6;
    public int SobrePeso7;
    public int SobrePeso8;
    public int SobrePeso9;
    
    public int PorDebajo1;
    public int PorDebajo2;
    public int PorDebajo3;
    public int PorDebajo4;
    public int PorDebajo5;
    public int PorDebajo6;
    public int PorDebajo7;
    public int PorDebajo8;
    public int PorDebajo9;
    
    public Enfermedad LD;

    public DatosGrafica() {
        LI = null;
        LD = null;
    }

    public DatosGrafica(DatosGrafica datos) {
        PesoOptimo1 = datos.PesoOptimo1;
        PesoOptimo2 = datos.PesoOptimo2;
        PesoOptimo3 = datos.PesoOptimo3;
        PesoOptimo4 = datos.PesoOptimo4;
        PesoOptimo5 = datos.PesoOptimo5;
        PesoOptimo6 = datos.PesoOptimo6;
        PesoOptimo7 = datos.PesoOptimo7;
        PesoOptimo8 = datos.PesoOptimo8;
        PesoOptimo9 = datos.PesoOptimo9;
        
        SobrePeso1 = datos.SobrePeso1;
        SobrePeso2 = datos.SobrePeso2;
        SobrePeso3 = datos.SobrePeso3;
        SobrePeso4 = datos.SobrePeso4;
        SobrePeso5 = datos.SobrePeso5;
        SobrePeso6 = datos.SobrePeso6;
        SobrePeso7 = datos.SobrePeso7;
        SobrePeso8 = datos.SobrePeso8;
        SobrePeso9 = datos.SobrePeso9;
        
        PorDebajo1 = datos.PorDebajo1;
        PorDebajo2 = datos.PorDebajo2;
        PorDebajo3 = datos.PorDebajo3;
        PorDebajo4 = datos.PorDebajo4;
        PorDebajo5 = datos.PorDebajo5;
        PorDebajo6 = datos.PorDebajo6;
        PorDebajo7 = datos.PorDebajo7;
        PorDebajo8 = datos.PorDebajo8;
        PorDebajo9 = datos.PorDebajo9;
        
        LI = null;
        LD = null;
    }
}
