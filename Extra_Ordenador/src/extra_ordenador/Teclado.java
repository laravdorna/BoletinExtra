/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_ordenador;

/**
 *
 * @author lvazquezdorna
 */
public class Teclado {

    //atributos
    private int numTeclas;

    //contructores
    //getter y setter
    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    //mostrar caracteristicas
    @Override
    public String toString() {
        return "\n\t__Caracteristicas del Teclado__\n" + "numero de tecls:\t" + numTeclas;
    }

}
