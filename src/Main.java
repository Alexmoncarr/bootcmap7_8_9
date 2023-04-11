import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;



public class Main {

    public static String reverse(String texto) {
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }

    public static void DividePorCero() throws ArithmeticException {
        int resultado = 1 / 0; // Genera una excepción ArithmeticException
    }




    public static void main(String[] args) {


        String[] nombres = {"Juan", "María", "Pedro", "Lucía", "Andrés"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }



        int[][] numeros = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("numeros[" + i + "][" + j + "] = " + numeros[i][j]);
            }
        }


        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.remove(2);
        vector.remove(2);
        System.out.println(vector); // Imprime "[1, 4, 5]"


        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("manzana");
        lista1.add("naranja");
        lista1.add("plátano");
        lista1.add("uva");

        LinkedList<String> lista2 = new LinkedList<>(lista1);
        for (String elemento : lista2) {
            System.out.println(elemento);
        }



        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            num.add(i);
        }

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0) {
                num.remove(i);
                i--;
            }
        }

        for (int nume : num) {
            System.out.println(num);
        }



        try {
            DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }


    }
}