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
public class Alquiler extends Barco {

    private String nombre;
    private Integer dni;
    private Integer fechaInicio;
    private Integer fechaFinal;

    public Alquiler(String nombre, Integer dni, Integer fechaInicio, Integer fechaFinal, Integer matricula, Double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nombre = nombre;
        this.dni = dni;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public Integer cantDiasAlquiler() {

        Integer cantDias = fechaFinal - fechaInicio;
        return cantDias;
    }

    public Double modulo() {
        Double mod = 0d;

        mod = eslora * 10;

        return mod;
    }

    public Double opAlquiler() {
        Double montoAlquiler = 0d;
        Double modEspecial = 0d;
        if (barcoEspecial == true) {
            
            BarcoEspecial barcoEspecial = new BarcoEspecial(3, 45d, 8, "Juan", 286544, 15, 20, 156828, 4.30, 1987);
            modEspecial=barcoEspecial.modBarcoEspecial();
            
            montoAlquiler = (double) cantDiasAlquiler() * modEspecial * 2;

        } else if (barcoEspecial==false) {
            montoAlquiler = cantDiasAlquiler() * modulo() * 2;
        }

        return montoAlquiler;
    }

}
