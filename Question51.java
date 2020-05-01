import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Question51 {


    public static void main(String[] args) {

        // 5.1.b

        String text = "red, green, yellow, blue";

        String[] elementos = generarArray(text);

        for (int i = 0; i < elementos.length; i++) {

            System.out.println(elementos[i]);

        }

        System.out.println();
        System.out.println("------------------------------");


        // 5.1.c




        for (int i = 1; i < elementos.length -1; i++) {

            elementos[i] = elementos[i+1];
        }

        elementos = Arrays.copyOf(elementos,elementos.length-1);

        System.out.println(elementos.length);
        for (String elemento:elementos
             ) {

            System.out.println(elemento);

        }

    }


    public static String[] generarArray(String text){

        String[] elementos = text.split(",");

        for (int i = 0; i < elementos.length; i++) {

            elementos[i] =elementos[i].trim();

        }

        return elementos;
    }
}
