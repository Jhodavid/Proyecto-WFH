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
    public DatosPesoOptimo PesoOptimo;
    public DatosSobrePeso SobrePeso;
    public DatosPorDebajo PorDebajo;
    public Enfermedad LD;

    public DatosGrafica() {
        PesoOptimo = null;
        SobrePeso = null;
        PorDebajo = null;
        LI = null;
        LD = null;
    }

    public DatosGrafica(DatosGrafica datos) {
        PesoOptimo = null;
        SobrePeso = null;
        PorDebajo = null;
        LI = null;
        LD = null;
    }
}
