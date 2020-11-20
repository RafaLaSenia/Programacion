import java.util.Scanner;

public class ejercicio_7 {

    public static void main(String[] args) {

        // Declaracion de Variables
        double x = 0;
        double y = 0;
        double z = 0;

        // Preguntar al Usuario cuantos niños y cuantas niñas hay
        System.out.println("Escribe la variable X: ");
        Scanner sa = new Scanner(System.in);
        x = sa.nextDouble();
        System.out.println("Escribe la variable Y: ");
        Scanner sb = new Scanner(System.in);
        y = sb.nextDouble();

        // Calculo para intercambiar el valor

        z = (1 + (Math.pow(x, 2)/y)) / (Math.pow(x, 3) / (1 + y));

        // Mostrar en pantalla el resultado
        System.out.println("La variable Z tiene un valor de = " + z);
    }

}


// Javier Gomez - Ejercicio 7