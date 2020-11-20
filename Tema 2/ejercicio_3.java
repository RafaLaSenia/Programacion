import java.util.Scanner;

public class ejercicio_3 {

    public static void main(String[] args) {

        // Declaracion de Variables
        int a = 0;
        int b = 0;

        // Preguntar al Usuario el valor de la Variable A y B
        System.out.println("Escribe la variable A: ");
        Scanner sa = new Scanner(System.in);
        a = sa.nextInt();
        System.out.println("Escribe la variable B: ");
        Scanner sb = new Scanner(System.in);
        b = sb.nextInt();

        // Mostrar en pantalla el resultado
        System.out.println("A + B = " +  (a + b));
        System.out.println("A - B = " +  (a - b));
        System.out.println("A / B = " +  (a / b));
        System.out.println("A x B = " +  (a * b));
    }

}


// Javier Gomez - Ejercicio 3