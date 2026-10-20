public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA ESTACIÓN DE MONITOREO ===");
        
        estacion estacion = new estacion("Laboratorio 1", "Temperatura");
        estacion.mostrarInformacion();

        System.out.println("\n--- Actualizando lectura ---");
        estacion.actualizarLectura(25.5);
        estacion.mostrarInformacion();

        System.out.println("\nTotal de estaciones: " + estacion.getTotalEstaciones());
    }
}