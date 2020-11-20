public class ejercicio_1_tema_3 {

    public static void main(String[] args) {

        String introduccion = "Palabra en Ingles:\tPalabra en Español:";

        // Declaracion de Variables - Palabras en Ingles [ING]
        String palabra1_ing = "Hello";
        String palabra2_ing = "How";
        String palabra3_ing = "Where";
        String palabra4_ing = "Charger";
        String palabra5_ing = "Flag";
        String palabra6_ing = "Keyboard";
        String palabra7_ing = "Screen";
        String palabra8_ing = "Trash";
        String palabra9_ing = "Mouse";
        String palabra10_ing = "Car";

        // Declaracion de Variables - Palabras en Español [ESP]
        String palabra1_esp = "Hola";
        String palabra2_esp = "Como";
        String palabra3_esp = "Donde";
        String palabra4_esp = "Cargador";
        String palabra5_esp = "Bandera";
        String palabra6_esp = "Teclado";
        String palabra7_esp = "Pantalla";
        String palabra8_esp = "Basura";
        String palabra9_esp = "Raton";
        String palabra10_esp = "Coche";

        // Mostrar en pantalla el resultado con tabuladores para que se separen en 2 columnas
        System.out.println(introduccion);    
        System.out.println(palabra1_ing + "\t\t\t" + palabra1_esp);
        System.out.println(palabra2_ing + "\t\t\t" + palabra2_esp);
        System.out.println(palabra3_ing + "\t\t\t" + palabra3_esp);
        System.out.println(palabra4_ing + "\t\t\t" + palabra4_esp);
        System.out.println(palabra5_ing + "\t\t\t" + palabra5_esp);
        // Al ser la palabra mas larga, en lugar de 3 tabulaciones he hecho 2
        System.out.println(palabra6_ing + "\t\t" + palabra6_esp);
        System.out.println(palabra7_ing + "\t\t\t" + palabra7_esp);
        System.out.println(palabra8_ing + "\t\t\t" + palabra8_esp);
        System.out.println(palabra9_ing + "\t\t\t" + palabra9_esp);
        System.out.println(palabra10_ing + "\t\t\t" + palabra10_esp);
    }

}

// Javier Gomez - Ejercicio 1 - Tema 3