public class Funciones {

    public static float iva(float price) {

        float iva = 0.16f;
        float calculoIva = price * iva;
        float precioConIva = price + calculoIva;

        return precioConIva;
    }
}
