import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JuegoVida {
    public static String CELDA_MUERTA = "\u2B1B";
    public static String CELDA_VIVA = "\u2B1C";
    private ArrayADT2D<Integer> tablero;

    public JuegoVida(int filas, int columnas) {
        tablero = new ArrayADT2D<>(filas, columnas);
    }

    public void leerArchivo() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                getClass().getResourceAsStream("/tablero.csv")))) {
            String linea;
            int fila = 0;
            while ((linea = br.readLine()) != null && fila < tablero.filas()) {
                String[] valores = linea.split(",");
                for (int col = 0; col < valores.length && col < tablero.columnas(); col++) {
                    int celula = Integer.parseInt(valores[col].trim());
                    tablero.insertarElemento(fila, col, celula);
                }
                fila++;
            }
        } catch (IOException e) {
            System.out.println("No se encontró el archivo");
        }
    }

    private int contarVecinos(int fila, int columna) {
        int vivos = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (i == fila && j == columna) continue;
                if (i >= 0 && i < tablero.filas() && j >= 0 && j < tablero.columnas()) {
                    vivos += tablero.obtenerElemento(i, j);
                }
            }
        }
        return vivos;
    }

    public void siguienteGeneracion() {
        ArrayADT2D<Integer> nuevo = new ArrayADT2D<>(tablero.filas(), tablero.columnas());

        for (int i = 0; i < tablero.filas(); i++) {
            for (int j = 0; j < tablero.columnas(); j++) {
                int vecinos = contarVecinos(i, j);
                int estado = tablero.obtenerElemento(i, j);

                if (estado == 1 && (vecinos < 2 || vecinos > 3)) {
                    nuevo.insertarElemento(i, j, 0);
                } else if (estado == 0 && vecinos == 3) {
                    nuevo.insertarElemento(i, j, 1);
                } else {
                    nuevo.insertarElemento(i, j, estado);
                }
            }
        }

        tablero = nuevo;
    }

    public void imprimirTablero() {
        for (int i = 0; i < tablero.filas(); i++) {
            for (int j = 0; j < tablero.columnas(); j++) {
                if (tablero.obtenerElemento(i, j) == 1) {
                    System.out.print(CELDA_VIVA);
                } else {
                    System.out.print(CELDA_MUERTA);
                }
            }
            System.out.println();
        }
    }
}
