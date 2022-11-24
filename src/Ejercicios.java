import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejercicios {
    public static String reverse(String texto) {

        char[] letras = texto.toCharArray();
        String textReverse = "";

        for (int i = texto.length(); i > 0; i--) {
            textReverse += letras[i -1];
        }

        return textReverse;
    }

    public static void dimenciones() {
        String[] unidimencional = {"uno", "dos", "tres", "cuatro", "cinco"};
        for (String element: unidimencional) {
            System.out.println(element);
        }

        int[][] bidimencional = new int[5][5];
        for (int i = 0; i < bidimencional.length; i++) {
            System.out.println("Index = " + i + " Element = " + (i+1));
            for (int j = 0; j < bidimencional.length; j++) {
                String salida = "Index = " + "[" + i + "]" + "[" + j + "]" + " Element = " + "[" + (i + 1) + "]" + "[" + (j + 1) + "]";
                System.out.println(salida);
            }
        }
    }

    public static void delete(int indexInit, int numIndexDelete) {
        int[] vector = {1,2,3,4,5};
        int contDelete = numIndexDelete;
//        Mostramos el array
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

//         eliminar
        for (int i = indexInit; i < vector.length - 1; i++) {
            vector[i] = vector[i + contDelete];
            contDelete = 1;
        }

//        Mostramos el nuevo array
        System.out.println("\n");
        for (int i = 0; i < vector.length - numIndexDelete; i++) {
            System.out.println(vector[i]);
        }

    }

    public static void list() {
        List<String> lista = new ArrayList<>();
        lista.add("Emmanuel");
        lista.add("Leonardo");
        lista.add("Emiliano");
        lista.add("Aaron");
        System.out.println("ArrayList");
        for (String element: lista) {
            System.out.println(element);
        }

        System.out.println("LinkedList");
        LinkedList<String> lista2 = new LinkedList<>(lista);
        for (String element: lista2) {
            System.out.println(element);
        }

    }

    public static void pares() {
        List<Integer> lista = new ArrayList<>();
        int numeroDeIndices = 10;
        for (int i = 0; i < numeroDeIndices; i++) {
            if(i % 2 == 1) {
                lista.add(i);
            }
        }


        for (int element: lista) {
            System.out.println(element);
        }

    }

    public static void dividePorCero() throws ArithmeticException {
        try {
            throw new ArithmeticException("Esto no puede hacerse");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Demo de codigo");
        }


    }

    public static void files(String fileIn, String fileOut) throws FileNotFoundException,IOException {
        try {
            System.out.println("Iniciando lectura...");
            InputStream fichero = new FileInputStream(fileIn);
            BufferedInputStream readFile = new BufferedInputStream(fichero);
            PrintStream output = new PrintStream(fileOut);


            try{
                int letter = readFile.read();
                while(letter != -1) {
                    output.print((char) letter);
                    letter = readFile.read();
                }
                fichero.close();
                readFile.close();
                output.close();

                System.out.println("Lectura y salida del texto satisfactoria");
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
