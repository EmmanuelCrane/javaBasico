public class estructurasDeControl {
    public static String concatenador() {
        String[] nombres = {"Emmanuel", "Ivan", "Olga", "Juan"};
        String nombresConcatenados = "";

        for (String nombre : nombres) {
            nombresConcatenados += nombre + " ";
        }
        return nombresConcatenados;
    }
}
