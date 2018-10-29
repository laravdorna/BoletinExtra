/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraobsetos2;

/**
 *
 * @author lara vazquez dorna
 */
public class ExtraObsetos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializa el objeto obj1 de la clase clase1 con las variables 5 y 4
        Clase1 obj1 = new Clase1(5, 4);
        //p1=5 ,p2=4
        //Imprimime por pantalla el objeto 1 aplicandole el metodo modificar pasandole el entero 4
        System.out.print(obj1.modificar(4) + " ");
        //el metodo modificar(4) hace lo siguiente:
        //i=4
        //p1 = 5+4;
        //p2 = 4 +4;
        //System.out.print(p2 + " "); que sera 8
        //return p1;// se devuelve p1 que sera 9 que será lo que imprima el sout anterior al acabar el metodo

        //Inicializa el objeto obj2 de la clase clase1 con las variables 5 y 4
        Clase1 obj2 = new Clase1(5, 4);
        //p1=5, p2=4
        //Imprimime por pantalla el objeto 2 aplicandole el metodo modificar pasandole el entero 5
        System.out.print(obj2.modificar(5) + " ");
        //el metodo modificar(5) hace lo siguiente:
        //i=5
        //p1 = 5+5;
        //p2 = 4 +5;
        //System.out.print(p2 + " "); que sera 9
        //return p1;// se devuelve p1 que sera 10será lo que imprima el sout anterior al acabar el metodo

        //Iguala el obj2 al obj1 guardando en obj2 los datos del obj1
        obj2 = obj1;
        //por lo que sus variables seran las siguientes
        //p1=9, p2=8;
        
        //Imprime obj2 aplicandole el metodo modificar pasandole el entero 5 
        System.out.println(obj2.modificar(5) + " ");
        //el metodo modificar(5) hace lo siguiente:
        //i=5
        //p1 = 9+5;
        //p2 = 8 +5;
        //System.out.print(p2 + " "); que sera 13
        //return p1;// se devuelve p1 que sera 14 será lo que imprima el sout anterior al acabar el metodo

    }

}
