import productos.Almacen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        boolean funciones = false;
        boolean estructurasDecontrol = false;
        boolean clases = false;
        boolean interfaces = false;
        boolean reverse = false;
        boolean dimenciones = false;
        boolean matriz = false;
        boolean list = false;
        boolean pares = false;
        boolean dividePorCero = false;
        boolean files = false;
        boolean productos = true;


//      Funciones
        if (funciones) {
            float price = 56.87f;
            Funciones funcionIva = new Funciones();
            float result = funcionIva.iva(price);
            System.out.println(result);
        }

//        Estructuras de control
        if(estructurasDecontrol) {
            String concatenador = estructurasDeControl.concatenador();
            System.out.println(concatenador);
        }

        //  Clases
        if(clases) {
            SmartPhone phone = new SmartPhone(true, true, true, true);
            SmartWatch watch = new SmartWatch(true, true, true, true);
            System.out.println(phone.toString());
            System.out.println(watch.toString());
        }

//        Interfaces
        if (interfaces) {
            CocheCRUDImpl coche = new CocheCRUDImpl();
            System.out.println(coche.save());
            System.out.println(coche.findAll());
            System.out.println(coche.delete());
        }

//  --------------------------- ejercicios 7, 8, 9 ---------------------------
//        reverse
        if(reverse) {
            String ejercicio1 = Ejercicios.reverse("Logre poner el texto alreves");
            System.out.println("reverse = " + ejercicio1);
        }
//        dimenciones
        if(dimenciones) {
            Ejercicios.dimenciones();
        }
//        matriz
        if(matriz) {
            Ejercicios.delete(2,2);
        }
//        crear un arrayList y convertirlo a un linkdList
        if (list) {
            Ejercicios.list();
        }
//        crear un arrayList de numeros pares
        if (pares) {
            Ejercicios.pares();
        }
//        Mostrar una exepcion al dividor por cero
        if (dividePorCero) {
            Ejercicios.dividePorCero();
        }
//        Trabajar con archivos inputStream y printStream
        if (files) {
            Ejercicios.files("src/text.txt", "src/salida.txt");
        }

//        crear productos, actualusar productos y listar productos
        if (productos) {
            Almacen almacen = new Almacen();
            almacen.createProduct("Taza", 99.99f);
            almacen.createProduct("Camisa", 150.87f);
            almacen.createProduct("Computadora", 30.000f);
            almacen.createProduct("Teclado", 200f);
            almacen.updateProduct();
        }

    }
}