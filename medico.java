import java.util.ArrayList;
 
public class medico {
    private String nombre;
    private ArrayList<String> horariosDisponibles = new ArrayList<>();
 
    public medico(String nombre) {
        this.nombre = nombre;
    }
 
    public void agregarHorario(String horario) {
        horariosDisponibles.add(horario);
        System.out.println("Horario agregado para el médico " + nombre + ": " + horario);
    }
 
    public ArrayList<String> getHorariosDisponibles() {
        return horariosDisponibles;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void notificarCita(cita cita) {
        System.out.println("📩 Notificación para el médico " + nombre + ": " + cita.getDatos());
    }
 
    // === Registrar diagnóstico y observaciones ===
    public void registrarDiagnostico(cita cita, String diagnostico, String tratamiento, String observaciones) {
        System.out.println("Módulo de registro clínico abierto para el paciente " + cita.getPaciente());
        cita.registrarDiagnostico(diagnostico, tratamiento, observaciones);
    }
}
