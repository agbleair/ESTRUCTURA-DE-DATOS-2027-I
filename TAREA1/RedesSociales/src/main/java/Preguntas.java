import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Preguntas {
    private ArrayList<String[]> datos = new ArrayList<>();
    public void leerArchivo(){
        try (BufferedReader lector = new BufferedReader(new InputStreamReader(
                getClass().getResourceAsStream("/datos_redes_sociales.csv")))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] row = linea.split(",");
                datos.add(row);
                //System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo");
        }
    }
    public void diferenciaSeguidores(){
        for(String[] row : datos){
            if(row[0].equalsIgnoreCase("TWITTER") && row[1].contains("SEGUIDORES")){
                int enero = Integer.parseInt(row[3]);
                int junio = Integer.parseInt(row[9]);
                int crecimiento = junio - enero;
                double porcentaje = (double) (crecimiento * 100) / enero;
                System.out.println("Diferencia de seguidores en twitter Enero - Junio: " + crecimiento);
                System.out.println("Diferencia en porcentaje: "  + porcentaje);
                //System.out.println(Arrays.toString(row));
            }

        }
    }

    public void visualizacionesYT() {
        Scanner scanner = new Scanner(System.in);
        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("Ingresa el mes inicial en valor numérico (1. Enero, 2. Febrero, 3. Marzo,...)");
        int mesInicial = scanner.nextInt();
        System.out.println("Mes final: ");
        int mesFinal = scanner.nextInt();

        int columnaCorrecta1 = mesInicial + 2;
        int columnaCorrecta2 = mesFinal + 2;

        for (String[] row : datos) {
            if (row[0].equalsIgnoreCase("YOUTUBE") && row[1].contains("VISUALIZACIONES")) {
                int mes1 = Integer.parseInt(row[columnaCorrecta1]);
                int mes2 = Integer.parseInt(row[columnaCorrecta2]);
                int diferencia = mes2 - mes1;
                System.out.println("Diferencia de visualizaciones entre " + meses[mesInicial] + " y " + meses[mesFinal] + ": " + diferencia);
            }

        }

    }
    public void crecimientoFBYTWT() {
        for (String[] row : datos) {
            if (row[0].equalsIgnoreCase("TWITTER") && row[1].equalsIgnoreCase("CRECIMIENTO DE FOLLOWERS")) {
                double suma = Double.parseDouble(row[3]) + Double.parseDouble(row[4]) +
                        Double.parseDouble(row[5]) + Double.parseDouble(row[6]) +
                        Double.parseDouble(row[7]) + Double.parseDouble(row[8]);
                double promedio = suma / 6;
                System.out.println("Promedio crecimiento Twitter Enero - Junio: " + promedio);
            }

            if (row[0].equalsIgnoreCase("FACEBOOK") && row[1].equalsIgnoreCase("CRECIMIENTO (seguidores)")) {
                double suma = Double.parseDouble(row[3]) + Double.parseDouble(row[4]) +
                        Double.parseDouble(row[5]) + Double.parseDouble(row[6]) +
                        Double.parseDouble(row[7]) + Double.parseDouble(row[8]);
                double promedio = suma / 6;
                System.out.println("Promedio crecimiento Facebook Enero - Junio: " + promedio);
            }
        }
    }

    public void promedioMeGusta(){
        for (String[] row : datos){
            if (row[0].equalsIgnoreCase("YOUTUBE") && row[1].toUpperCase().contains("ME GUSTA")) {
                int suma = 0;
                for (int i = 3; i <= 14; i++) { // Enero (3) a Diciembre (14)
                    suma += Integer.parseInt(row[i].trim());
                }
                System.out.println("Promedio Me gusta YouTube: " + (suma / 12));
            }

            if (row[0].equalsIgnoreCase("TWITTER") && row[1].toUpperCase().contains("ME GUSTA")) {
                int suma = 0;
                for (int i = 3; i <= 14; i++) {
                    suma += Integer.parseInt(row[i].trim());
                }
                System.out.println("Promedio Me gusta Twitter: " + (suma / 12));
            }

            if (row[0].equalsIgnoreCase("FACEBOOK") && row[1].toUpperCase().contains("ME GUSTA")) {
                int suma = 0;
                for (int i = 3; i <= 14; i++) {
                    suma += Integer.parseInt(row[i].trim());
                }
                System.out.println("Promedio Me gusta Facebook: " + (suma / 12));
            }

        }
    }
    }


