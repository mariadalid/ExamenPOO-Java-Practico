public class Contabilidad extends Empleados {
    String tipoContrato;
    String area;

    //Constructor
    public Contabilidad (String nombre, int idEmpleado, double sueldo, String tipoContrato, String area){
        super(nombre, idEmpleado, sueldo);
        this.tipoContrato = tipoContrato;
        this.area = area;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    //@Override
    public void mostrarDatos(){
        System.out.println(" Empleado: " + this.nombre + " | " + "ID: " + this.idEmpleado + " | " + "Sueldo: " + this.sueldo + " | " + "Área: " + this.area + "Contrato: " + this.tipoContrato);
    }
}
