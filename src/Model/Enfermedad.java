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
public class Enfermedad {
    
    public int IdEnfermedad;
    public String Titulo;
    public String Tipo;
    public String Descripcion;
    public String Sintomas;

    public Enfermedad() {
    }

    public Enfermedad(Enfermedad datos) {
        IdEnfermedad = datos.IdEnfermedad;
        Titulo = datos.Titulo;
        Tipo = datos.Tipo;
        Descripcion = datos.Descripcion;
        Sintomas = datos.Sintomas;
    }
}
