public class Main {
    public static void main(String[] args) {
        try {
            PalabrasUnicas cuento = new PalabrasUnicas();
            cuento.leerArchivo();

            System.out.println("Número de palabras diferentes: " + cuento.contarPalabras());
            System.out.println(cuento);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
