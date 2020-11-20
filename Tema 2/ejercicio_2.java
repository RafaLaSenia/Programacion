import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {

        // Declaracion de Variables
        int a = 0;
        int b = 0;
        int c = 0;

        // Preguntar al Usuario cuantos niños y cuantas niñas hay
        System.out.println("Escribe la variable A: ");
        Scanner sa = new Scanner(System.in);
        a = sa.nextInt();
        System.out.println("Escribe la variable B: ");
        Scanner sb = new Scanner(System.in);
        b = sb.nextInt();

        // Calculo para intercambiar el valor
        c = a;
        a = b;
        b = c;

        // Mostrar en pantalla el resultado
        System.out.println("La variable A se ha intercambiado por la B = " + a);
        System.out.println("La variable B se ha intercambiado por la A = " + b);
    }

}


// Javier Gomez - Ejercicio 2