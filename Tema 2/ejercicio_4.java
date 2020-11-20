import java.util.Scanner;

public class ejercicio_4 {

    public static void main(String[] args) {

        // Declaracion de Variables
        int a = 0;
        int b = 0;
        double p_niños = 0;
        double p_niñas = 0;

        // Preguntar al Usuario cuantos niños hay
        Scanner sa = new Scanner(System.in);
        System.out.println("Escribe cuantos niños hay en clase: ");
        a = sa.nextInt();

        // Preguntar al Usuario cuantos niños hay
        Scanner sb = new Scanner(System.in);
        System.out.println("Escribe cuantas niñas hay en clase: ");
        b = sb.nextInt();

        // Calculo del porcentaje de niños y de niñas en base al total
        p_niños = 100 * a/(a + b);
        p_niñas = 100 * b/(a + b);

        // Mostrar en pantalla el resultado
        System.out.println("Hay un  procentaje del: " + p_niños + "% de niños en la clase");
        System.out.println("Hay un  procentaje del: " + p_niñas + "% de niñas en la clase");

    }

}


// Javier Gomez - Ejercicio 4