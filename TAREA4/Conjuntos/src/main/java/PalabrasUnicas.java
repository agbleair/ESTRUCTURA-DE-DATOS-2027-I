import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PalabrasUnicas {
    private Set<String> palabras;

    public PalabrasUnicas() {
        this.palabras = new HashSet<>();
    }

    public void leerArchivo() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("cuento.txt")))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                for (String palabra : linea.split("[\\s,.;:!?\"«»]+")) {
                    palabra = palabra.toLowerCase();
                    if (!palabra.isEmpty()) {
                        palabras.add(palabra);
                    }
                }
            }
        }
    }

    public int contarPalabras() {
        return palabras.size();
    }

    @Override
    public String toString() {
        return "Palabras únicas: " + palabras;
    }
}
