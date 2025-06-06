public class Main {
    public static void main(String[] args) {
        Empleados empleado1 = new Empleados("Carlos", 101, 1200.0);
        System.out.println(empleado1.nombre);
        empleado1.mostrarDatos();

        RecursosHumanos empleado2 = new RecursosHumanos("Carla", 202, 14000.0, "Recursos Humanos","Alto");
        empleado2.mostrarDatos();

        Produccion empleado3 = new Produccion("Luis", 303, 110000.0, "Noche", "Produccion");
        empleado3.mostrarDatos();

        Contabilidad empleado4 = new Contabilidad("Sofía", 404, 13000.0, "Permanente", "Contabilidad");
        empleado4.mostrarDatos();

        SoporteTecnico empleado5 = new SoporteTecnico("Pablo", 505, 12500.0, "Nivel 2", "Soporte tecnico");
        empleado5.mostrarDatos();
    }
}