public class estacion {
    private int id;
    private String ubicacion;
    private String variable;
    private double lectura;
    private static int totalEstaciones = 0;

    public estacion(String ubicacion, String variable) {
        totalEstaciones++;
        this.id = totalEstaciones;
        this.ubicacion = ubicacion;
        this.variable = variable;
        this.lectura = 0;
    }

    public void actualizarLectura(double nuevaLectura) {
        this.lectura = nuevaLectura;
    }

    public static int getTotalEstaciones() {
        return totalEstaciones;
    }

    public void mostrarInformacion() {
        System.out.println("Estación ID: " + id + " | Ubicación: " + ubicacion + " | Variable: " + variable + " | Lectura: " + lectura);
    }
}
