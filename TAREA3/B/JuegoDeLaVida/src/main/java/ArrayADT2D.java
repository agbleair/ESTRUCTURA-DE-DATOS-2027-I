public class ArrayADT2D <T>{

    private Object[][] tabla;
    private int filas;
    private int columnas;

    public ArrayADT2D(int f, int c) {
        this.filas = f;
        this.columnas = c;
        this.tabla = new Object[filas][columnas];
    }

    public T obtenerElemento(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            return (T) tabla[fila][columna];
        } else {
            System.out.println("Índice fuera de rango");
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public void insertarElemento(int fila, int columna, T elemento) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            tabla[fila][columna] = elemento;
        } else {
            System.out.println("Índice fuera de rango");
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public int filas() {
        return filas;
    }

    public int columnas() {
        return columnas;
    }

    public void imprimir() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + tabla[i][j] + "]");
            }
            System.out.println();
        }
    }

}

