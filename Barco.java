/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio33;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Barco {

    protected Integer matricula;
    protected Double eslora;
    protected Integer anioFabricacion;
    protected Boolean barcoEspecial;
    Scanner leer = new Scanner(System.in);

    public Barco(Integer matricula, Double eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public Barco() {

    }

    public Boolean tipoBarco() {
        barcoEspecial = false;

        String res = "";
        System.out.println("¿El barco que desea alquilar tiene camarotes o mastiles? Ingrese SI o NO.");
        res = leer.next().toUpperCase();
        if ("SI".equals(res)) {
            barcoEspecial = true;
            

        }

        return barcoEspecial;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + ", barcoEspecial=" + barcoEspecial + ", leer=" + leer + '}';
    }

}
