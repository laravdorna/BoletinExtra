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
public class Rato {

    private boolean inalambrico;
    private String modelo;

    
    //getter y setters
    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //mostrar caracteristicas

    @Override
    public String toString() {
        return "\n\t__Caracteristicas del Raton__\n" + "tipo de conexion inalambrica:\t" + inalambrico + ", modelo=" + modelo + '}';
    }
    
    
}
