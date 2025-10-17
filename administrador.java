import java.util.ArrayList;

public class administrador {
    private String nombre;

    public administrador(String nombre) {
        this.nombre = nombre;
    }

    public void generarReporte(ArrayList<cita> citas, String formato) {
        System.out.println("\n--- Reporte de citas (" + formato.toUpperCase() + ") ---");
        for (cita c : citas) {
            System.out.println(c.getDatos());
            System.out.println(c.getHistorialClinico());
            System.out.println("---------------------------");
        }
        System.out.println("📊 Reporte generado por el administrador " + nombre);
    }
}
