/*
 * ejercicio extra que calcula la nota media para clase de programacion

prueba f para clase de desenvolvimiento de contornos
 */
package calculadoranotamedia;

import java.util.Scanner;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class CalculadoraNotaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // istanciar objeto
        Notas notas = new Notas();
        int opcion;

        System.out.println(
                "************************************************************\n"
                + "****\t\tBienvenido al calculador de Notas\t****"
                + "\n************************************************************\n");

        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    //nota media de la teoria
                    notas.calcularNotaTeoria();
                    break;
                case 2:
                    //nota media de la practica
                    notas.calcularNotaPractica();
                    break;
                case 3:
                    //nota boletines
                    notas.calcularNotaBoletines();
                    break;
                case 4:
                    //nota final
                    notas.calcularNotaFinal();
                    break;
                case 0:
                    System.out.println("\n\t Gracias por usar la calculadora.");
                    break;
                default:
                    System.out.println("La operación elegida no existe.");
                    break;
            }
        } while (opcion != 0);

    }

    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nQue operación desea realizar:"
                + "\n1=>Calcular nota teorica"
                + "\n2=>Calcular nota practica"
                + "\n3=>Calcular nota boletines"
                + "\n4=>Calcular nota media"
                + "\n0=>Salir");

        return Integer.parseInt(teclado.nextLine());
    }

}
