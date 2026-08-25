import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Preguntas preguntas = new Preguntas();
        preguntas.leerArchivo();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("DATOS REDES SOCIALES");
            System.out.println("Selecciona el número con la información que desees conocer");
            System.out.println("1.- DIferencia de Seguidores en Twitter entre los meses Enero y Junio");
            System.out.println("2.- Diferencia en visualizaciones de YouTube");
            System.out.println("3.- Promedio de crecimiento de seguidores entre Twitter y Facebook");
            System.out.println("4.- Promedio de 'Me Gusta' en YouTube, Twitter y Facebook");
            System.out.println("5.- Salir");
            opcion = teclado.nextInt();

            switch(opcion){
                case 1: preguntas.diferenciaSeguidores();
                break;
                case 2: preguntas.visualizacionesYT();
                break;
                case 3: preguntas.crecimientoFBYTWT();
                break;
                case 4: preguntas.promedioMeGusta();
                case 5:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Opción no válida");
            }


        } while (opcion != 5);
        teclado.close();
    }

}
