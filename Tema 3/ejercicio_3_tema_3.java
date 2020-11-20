import java.math.BigDecimal;
import java.math.RoundingMode;

public class ejercicio_3_tema_3 {

    public static void main(String[] args) {

        // Declaracion de Variables a y b entera
        int a = 8;
        int b = 3;

        // cambiar a y b por double para hacer un calculo double
        double calculo = (double) a / b;
       
        /* 
        * Rafa, en el ejercicio exige que hayan 16 decimales, lo cual es imposible porque solo permiten 15 como maximo.
        * Para poder utilizar mas de 16, necesitaremos importar lo siguiente: [import java.math.BigDecimal][import java.math.RoundingMode] 
        * Ahora que se tiene importado, se crean 2 variables a_16 y b_16 , las cuales seran de la clase BigDecimal, a los cuales añadiremos 
        * las variables a y b (doubles) y las transformaremos.
        * Despues craeremos una variable de clase BigDecimal llamada calculo_16, en la cual aplicaremos el calculo de la siguiente forma:
        * BigDecimal calculo_16 = 
        * NUMERO A DIVIDIR(a_16).divide(NUMERO POR EL CUAL SE DIVIDIRA(b_16), PRECISION DE LOS DECIMALES(16), RoundingMode.HALF_UP(Redondear numeros, Hacia arriba));
        */


        // Declaracion de variables BigDecimal
        BigDecimal a_16 = new BigDecimal(a);
        BigDecimal b_16 = new BigDecimal(b);

        // Declaracion de un BigDecimal y su posterior calculo
        BigDecimal calculo_16 = a_16.divide(b_16, 16, RoundingMode.HALF_UP);

        // Mostrar en pantalla el calculo BigDecimal
        System.out.println(calculo_16);

        // Mostrar en pantalla los calculos
        System.out.printf("%.2f \n", calculo);
        System.out.printf(" %.2f \n", calculo);
        System.out.printf("  %.3f \n", calculo);
        System.out.printf("%07.3f \n", calculo);
        System.out.printf("   %.4f \n", calculo);
        System.out.printf("%.3f \n", calculo);
        System.out.printf("   %.5f \n", calculo);
        System.out.printf("%010.0f \n", calculo);

    }

}

// Javier Gomez - Ejercicio 3 - Tema 3