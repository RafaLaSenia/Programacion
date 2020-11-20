import java.util.Scanner;

public class ejercicio_6b {

    // ESTE ES EL EJECICIO 6, PERO CON CONDICIONES

    public static void main(String[] args) {

        // Declaracion de Variables
        double primer_examen = 0;
        double valoracion_primer_examen = 40;
        double nota_deseada = 0;
        double valoracion_segundo_examen = 60;
        double valor_nota_p_media = 0;
        double segundo_examen = 0;
        double valor_nota_s_media = 0;

        // Preguntar al Usuario el valor la nota del primer examen

        Scanner sp_ex = new Scanner(System.in);
        System.out.println("Hola, introduce la nota de tu primer examen: ");

        // Comprobar si el valor introducido es un Double, si no, se lo pregunto de
        // nuevo
        while (!sp_ex.hasNextDouble()) {

            System.out.println("Lo siento, pero no has introducido un numero para tu primera nota :(");
            // [COMPROBADOR] System.out.println(primer_examen);
            System.out.println("Prueba a escribirlo de nuevo: ");
            sp_ex.next();
        }

        // Si es correcto, se le añade a la variable primer_examen
        primer_examen = sp_ex.nextDouble();
        // [COMPROBADOR] System.out.println(primer_examen);

        // Comprobar que la nota del primer examen que me esta dando el Usuario es mayor
        // o igual que 0, y menor o igual que 10
        if (primer_examen <= 10 && primer_examen >= 0) {
            // Preguntar al Usuario el valor de la nota deseada
            Scanner sn_des = new Scanner(System.in);
            System.out.println("¿Que nota te gustaria sacar en el trimestre?: ");

            // Comprobar si el valor introducido es un Double, si no, se lo pregunto de
            // nuevo (Como el anterior)
            while (!sn_des.hasNextDouble()) {

                System.out.println("Lo siento, pero no has introducido un numero para tu nota deseada :(");
                // [COMPROBADOR] System.out.println(nota_deseada);
                System.out.println("Prueba a escribirlo de nuevo: ");
                sn_des.next();
            }

            // Si es correcto, se le añade a la variable nota_deseada
            nota_deseada = sn_des.nextDouble();
            // [COMPROBADOR] System.out.println(nota_deseada);

            // Comprobar que la nota deseada del trimestre que me esta dando el Usuario es
            // mayor
            // o igual que 0, y menor o igual que 10
            if (nota_deseada <= 10 && nota_deseada >= 0) {
                valor_nota_p_media = (primer_examen * valoracion_primer_examen / 100);
                valor_nota_s_media = nota_deseada - valor_nota_p_media;
                segundo_examen = (valor_nota_s_media * 100) / valoracion_segundo_examen;

                // Comprobar que la nota del segundo examen que me ha dado el resultado del
                // calculo sea mayor o igual a 0 y que sea menor o igual a 10
                if (segundo_examen >= 0 && segundo_examen <= 10) {
                    System.out.println("Para tener un : " + nota_deseada + " deberias de sacar en el segundo examen: "
                            + segundo_examen);
                } else
                    System.out.println("Lo siento, pero ya no puedes hacer nada para obtener " + nota_deseada
                            + " en el trimestre");
            } else
                System.out.println("Tu nota deseada para el trimestre es imposible");

        } else
            System.out.println("La nota de tu primer examen es invalida");

    }

}

// Javier Gomez - Ejercicio 6