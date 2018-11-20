/*
 * esta clase padre tiene que tener Cpu Rato en herencia y un metodo visualizar Atributos
y otro clacularPrecio
 */
package extra_ordenador;

/**
 *
 * @author lvazquezdorna
 */
public class Ordenador {

    //atributos
    int var;
    Cpu procesador;
    Rato raton;
    Teclado teclado;
    Monitor monitor;

    public Ordenador() {
        raton = new Rato();
        procesador = new Cpu();
    }
    //se puede instanciar las clases en los atributos o en el contructor


    
    
    /**
     * Metodo que devuelve el precio del ordenador
     * @return el precio obtenido
     */
    public float calcularPrecio() {
        float precio = 0;
        precio= procesador.getRam()*5+teclado.getNumTeclas()*7+monitor.getPulgadas()*12;
        if (raton.isInalambrico()) {
           precio+=1.5;
        }else{
        precio+=1;
        }
        precio= precio+teclado.getNumTeclas()*7+monitor.getPulgadas()*12;
         return precio;
    }

}
