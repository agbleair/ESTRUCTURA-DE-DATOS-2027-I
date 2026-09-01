import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class NominaICO {
    private ArrayADT<Empleado> datos;
    private int anhosAntiguedad;

    public NominaICO(int capacidad) {
        this.datos = new ArrayADT<>(capacidad);
    }

    public void leerArchivo(){
        System.out.println(getClass().getResource("/junio.dat"));
        try(BufferedReader lector = new BufferedReader(new InputStreamReader(
                getClass().getResourceAsStream("/junio.dat")))){
            String linea;
            int indice = 0;
            lector.readLine();
            while ((linea = lector.readLine()) != null && indice < datos.longitud()){
                String[] campos = linea.split(",");
                Empleado empleado = new Empleado(Integer.parseInt(campos[0].trim()), campos[1].trim(), campos[2].trim(), campos[3].trim(), Integer.parseInt(campos[4].trim()), (int) Double.parseDouble(campos[5].trim()), Integer.parseInt(campos[6].trim()));
                datos.insertarElemento(indice, empleado);
                indice++;
            }
        } catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }


    }

    public void empleadoMayorAntiguedad(){
        Empleado mayor = null;
        for (int i = 0; i < datos.longitud(); i++) {
            Empleado emp = datos.obtenerElemento(i);
            if(emp != null) {
                if (mayor == null || emp.getAnhoIngreso() < mayor.getAnhoIngreso()) {
                    mayor = emp;
                }
            }
        }
        if(mayor!= null){
            anhosAntiguedad = Year.now().getValue() - mayor.getAnhoIngreso();
            System.out.println("Empleado con mayor antigüedad: ");
            System.out.println("Número de empleado: "+ mayor.getNumeroTrabajador());
            System.out.println("Nombre: " + mayor.getNombreCompleto());
            System.out.println("Años de antigüedad: "+ anhosAntiguedad);
        }

    }

    public void empleadoMenorAntiguedad(){
        Empleado menor = null;
        for (int i = 0; i < datos.longitud(); i++) {
            Empleado emp = datos.obtenerElemento(i);
            if(emp != null) {
                if (menor == null || emp.getAnhoIngreso() > menor.getAnhoIngreso()) {
                    menor = emp;
                }
            }
        }
        if(menor != null){
            anhosAntiguedad = Year.now().getValue() - menor.getAnhoIngreso();
            System.out.println("Empleado con menor antigüedad: ");
            System.out.println("Número de empleado: "+ menor.getNumeroTrabajador());
            System.out.println("Nombre: " + menor.getNombreCompleto());
            System.out.println("Años de antigüedad: "+ anhosAntiguedad);
        }
    }
    public void imprimirNomina(){
        for (int i = 0; i < datos.longitud(); i++) {
            Empleado e = datos.obtenerElemento(i);
            if(e != null){
                System.out.println("Número de empleado: " + e.getNumeroTrabajador());
                System.out.println("Nombre: " + e.getNombreCompleto());
                System.out.println("Horas extra trabajadas: " + e.getHorasExtra());
                System.out.println("Sueldo base: " + e.getSueldoBase());
                System.out.println("Sueldo total: " + e.calcularSueldo());
                System.out.println("======================================");
            }

        }
    }
}
