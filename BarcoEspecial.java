/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio33;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class BarcoEspecial extends Alquiler {
    private Integer numMastiles;
    private Double potencia;
    private Integer camarotes;

    public BarcoEspecial(Integer numMastiles, Double potencia, Integer camarotes, String nombre, Integer dni, Integer fechaInicio, Integer fechaFinal, Integer matricula, Double eslora, Integer anioFabricacion) {
        super(nombre, dni, fechaInicio, fechaFinal, matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public BarcoEspecial(String nombre, Integer dni, Integer fechaInicio, Integer fechaFinal, Integer matricula, Double eslora, Integer anioFabricacion) {
        super(nombre, dni, fechaInicio, fechaFinal, matricula, eslora, anioFabricacion);
        
    }    


    
    public Double modBarcoEspecial(){
        Double modEspecial=0d;
        modEspecial=(eslora*10)+numMastiles+potencia+camarotes;
        
        return modEspecial;
    }
    
    
    
    

}
