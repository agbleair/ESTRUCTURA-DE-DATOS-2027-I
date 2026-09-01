public class Main {
    static void main(String[] args) {
        NominaICO nomina = new NominaICO(50);
        nomina.leerArchivo();
        nomina.empleadoMayorAntiguedad();
        System.out.println("======================================");
        nomina.empleadoMenorAntiguedad();
        System.out.println("======================================");
        System.out.println("LISTA DE EMPLEADOS COMPLETA");
        nomina.imprimirNomina();
    }

}
