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
public class Monitor {

    //atributos
    private String marca;
    private float pulgadas;

    //constructores
    public Monitor() {
    }

    public Monitor(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    // mostrar y coger
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    //mostrar caracteristicas
    @Override
    public String toString() {
        return "\n\t__Caracteristicas del Monitor__\n" + "marca:\t" + marca + "\npulgadas:\t" + pulgadas;
    }

}
