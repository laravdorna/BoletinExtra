/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_ordenador;

import java.util.Scanner;

/**
 *
 * @author lvazquezdorna
 */
public class Cpu {

    private int nucleos;
    private int ram;

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "\n\t__Caracteristicas de la CPU__\n" + "numero de nucleos:\t" + nucleos + "\nram:\t" + ram;
    }

    public void pedirDatos() {
        Scanner teclado = new Scanner(System.in);

    }
}
