import java.time.Year;

public class Empleado {
    public static final double CUOTA_HORA_EXTRA = 276.5;
    public static final double PORCENTAJE_BONO = 0.03; //3%
    private int numeroTrabajador;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int horasExtra;
    private int sueldoBase;
    private int anhoIngreso;

    public Empleado() {
    }

    public Empleado(int numeroTrabajador, String nombres, String apellidoPaterno, String apellidoMaterno, int horasExtra, int sueldoBase, int anhoIngreso) {
        this.numeroTrabajador = numeroTrabajador;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.anhoIngreso = anhoIngreso;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAnhoIngreso() {
        return anhoIngreso;
    }

    public void setAnhoIngreso(int anhoIngreso) {
        this.anhoIngreso = anhoIngreso;
    }
    public String getNombreCompleto(){
        return nombres + " " + apellidoPaterno + " " + apellidoMaterno;
    }

    public double calcularSueldo(){
        double sueldoTotal;
        int anhoActual = Year.now().getValue();
        int antiguedad = anhoActual - anhoIngreso;

        double pagoHorasExtra = horasExtra * CUOTA_HORA_EXTRA;
        double bonoAntiguedad = sueldoBase * PORCENTAJE_BONO * antiguedad;
        sueldoTotal = sueldoBase + pagoHorasExtra + bonoAntiguedad;
        return sueldoTotal;

    }

}
