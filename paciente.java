public class paciente {
    private String nombre;

    public paciente(String nombre) {
        this.nombre = nombre;
    }

    public cita agendarCita(String fecha, String hora, medico medico, String lugar) {
        System.out.println(nombre + " está agendando una cita...");
        cita nuevaCita = new cita(fecha, hora, medico.getNombre(), lugar, nombre);
        System.out.println("✅ Cita agendada con éxito.");
        System.out.println("📧 Enviando correo de confirmación a " + nombre);
        medico.notificarCita(nuevaCita);
        return nuevaCita;
    }

    // === Notificación antes de la cita ===
    public void recibirNotificacion(cita cita) {
        System.out.println("📱 Notificación enviada a " + nombre + ":");
        System.out.println("Recordatorio: Tienes una cita mañana.");
        System.out.println(cita.getResumenCita());
    }
}

