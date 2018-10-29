/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraobsetos2;

/**
 *
 * @author lvazquezdorna
 */
public class Clase1 {
    //declaracion de variables
    int p1,p2;//se declaran las variables p1 y p2 que componen el objeto

    //CONSTRUCTOR 
    //se crea un constructor que inicializa las dos variables. 
public Clase1 (int i, int j){
p1=i;
p2=j;
}

//METODOS
//metodo que devuelve un entero y se le pasa un entero 
public int modificar(int i){
p1=p1+i;//se le suma a p1 el entero dado (i) y se guarda en la misma variable
p2=p2+i;//se le suma a p2 el entero dado (i) y se guarda en la misma variable
System.out.print(p2+" "); //se muestra por pantalla p2
return p1;// se devuelve p1
}

}
