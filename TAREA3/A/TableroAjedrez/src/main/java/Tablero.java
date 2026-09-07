public class Tablero {
    public static final String REY_BLANCO   = "\u2654";
    public static final String REINA_BLANCA = "\u2655";
    public static final String TORRE_BLANCA = "\u2656";
    public static final String ALFIL_BLANCO = "\u2657";
    public static final String CABALLO_BLANCO = "\u2658";
    public static final String PEON_BLANCO  = "\u2659";

    public static final String REY_NEGRO   = "\u265A";
    public static final String REINA_NEGRA = "\u265B";
    public static final String TORRE_NEGRA = "\u265C";
    public static final String ALFIL_NEGRO = "\u265D";
    public static final String CABALLO_NEGRO = "\u265E";
    public static final String PEON_NEGRO  = "\u265F";

    private ArrayADT2D<String> tablero;

    public Tablero() {
        tablero = new ArrayADT2D<>(8, 8);

        for (int i = 0; i < tablero.filas(); i++) {
            for (int j = 0; j < tablero.columnas(); j++) {
                tablero.insertarElemento(i, j, " ");
            }
        }

        tablero.insertarElemento(0, 0, TORRE_NEGRA);
        tablero.insertarElemento(0, 1, CABALLO_NEGRO);
        tablero.insertarElemento(0, 2, ALFIL_NEGRO);
        tablero.insertarElemento(0, 3, REINA_NEGRA);
        tablero.insertarElemento(0, 4, REY_NEGRO);
        tablero.insertarElemento(0, 5, ALFIL_NEGRO);
        tablero.insertarElemento(0, 6, CABALLO_NEGRO);
        tablero.insertarElemento(0, 7, TORRE_NEGRA);

        for (int j = 0; j < 8; j++) {
            tablero.insertarElemento(1, j, PEON_NEGRO);
            tablero.insertarElemento(6, j, PEON_BLANCO);
        }

        tablero.insertarElemento(7, 0, TORRE_BLANCA);
        tablero.insertarElemento(7, 1, CABALLO_BLANCO);
        tablero.insertarElemento(7, 2, ALFIL_BLANCO);
        tablero.insertarElemento(7, 3, REINA_BLANCA);
        tablero.insertarElemento(7, 4, REY_BLANCO);
        tablero.insertarElemento(7, 5, ALFIL_BLANCO);
        tablero.insertarElemento(7, 6, CABALLO_BLANCO);
        tablero.insertarElemento(7, 7, TORRE_BLANCA);
    }

    public void imprimirTablero() {
        tablero.imprimir();
    }
}