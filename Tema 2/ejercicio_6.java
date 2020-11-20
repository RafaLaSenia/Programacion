import java.util.Scanner;

public class ejercicio_6 {

    // ESTE ES EL EJECICIO 6, PERO SIN CONDICIONES

    public static void main(String[] args) {

        // Declaracion de Variables
        double primer_examen = 0;
        double valoracion_primer_examen = 40;
        double nota_deseada = 0;
        double valoracion_segundo_examen = 60;
        double valor_nota_p_media = 0;
        double segundo_examen = 0;
        double valor_nota_s_media = 0;

        // Preguntar al Usuario el valor de: la nota del primer examen y la nota deseada del trimestre
        System.out.println("Hola, introduce la nota de tu primer examen: ");
        Scanner sp_ex = new Scanner(System.in);
        primer_examen = sp_ex.nextDouble();
        System.out.println("¿Que nota te gustaria sacar en el trimestre?: ");
        Scanner sn_des = new Scanner(System.in);
        nota_deseada = sn_des.nextDouble();
        valor_nota_p_media = (primer_examen * valoracion_primer_examen/100);
        valor_nota_s_media = nota_deseada - valor_nota_p_media;
        segundo_examen = (valor_nota_s_media*100) / valoracion_segundo_examen;
        System.out.println("Para tener un : " + nota_deseada + " deberias de sacar en el segundo examen: " + segundo_examen);

    }

}


// Javier Gomez - Ejercicio 6