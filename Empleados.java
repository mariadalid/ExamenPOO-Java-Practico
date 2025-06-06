public class Empleados {
    protected String nombre;
    protected int idEmpleado;
    protected double sueldo;

    public Empleados(String nombre, int idEmpleado, double sueldo){
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    //Metodo mostrardatos
    public void mostrarDatos() {
        System.out.println(" Empleado: " + this.nombre + " | " + "ID: " + this.idEmpleado + " | " + "Sueldo: " + this.sueldo);
    }

}
