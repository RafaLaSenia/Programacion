import java.util.Scanner;

public class ejercicio_5 {

    public static void main(String[] args) {

        // Declaracion de Variables
        double a = 0;
        final double cambio = 166.386;
        double conversor = 0;

        // Preguntar al Usuario que introduzca la cantidad de EUROS 
        System.out.println("Hola, introduce el numero de EUROS (€) de los cuales te interesaria saber su valor monetario en PESETAS (pts): ");
        Scanner sa = new Scanner(System.in);
        a = sa.nextDouble();

        // Calculo para convertir EUROS a PESETAS
        conversor = a * cambio;

        // Mostrar en pantalla el resultado
        System.out.println("La cantidad de EUROS que me has escrito se corresponden a : " + conversor  + " PTS");

    }

}


// Javier Gomez - Ejercicio 5