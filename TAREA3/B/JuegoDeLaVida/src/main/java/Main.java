public class Main {
    static void main(String[] args) {
        JuegoVida juego = new JuegoVida(10, 10);
        juego.leerArchivo();
        for (int gen = 0; gen < 11; gen++) {
            System.out.println("Generación " + gen);
            juego.imprimirTablero();
            juego.siguienteGeneracion();
        }
    }
}
