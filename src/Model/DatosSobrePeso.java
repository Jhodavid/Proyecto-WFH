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
public class DatosSobrePeso {
    public Enfermedad LI;
    public int Dato;
    public Enfermedad LD;

    public DatosSobrePeso() {
        LI = null;
        LD = null;
    }

    public DatosSobrePeso(int dato) {
        Dato = dato;
        LI = null;
        LD = null;
    }
}
