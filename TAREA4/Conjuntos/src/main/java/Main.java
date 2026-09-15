public class Main {
    public static void main(String[] args) {
        try {
            PalabrasUnicas pu = new PalabrasUnicas();
            pu.leerArchivo();

            System.out.println("Número de palabras diferentes: " + pu.contarPalabras());
            System.out.println(pu);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
