import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Crear actores
        medico medico1 = new medico("Dra. Pérez");
        paciente paciente1 = new paciente("Juan López");
        administrador admin = new administrador("Carlos Gómez");

        // Médico define sus horarios
        medico1.agregarHorario("Lunes 10:00 am");
        medico1.agregarHorario("Martes 2:00 pm");

        // Paciente agenda una cita
        cita cita1 = paciente1.agendarCita("2025-10-20", "10:00 am", medico1, "Clínica Central");

        // Notificación antes de la cita (simulada)
        System.out.println("\n⏰ Falta menos de 24 horas para la cita...");
        paciente1.recibirNotificacion(cita1);

        // Médico registra diagnóstico
        System.out.println("\n🔍 Día de la cita...");
        medico1.registrarDiagnostico(cita1,
                "Gripe común",
                "Reposo y líquidos",
                "El paciente debe descansar y volver si presenta fiebre alta.");

        // Administrador genera reporte final
        ArrayList<cita> listaCitas = new ArrayList<>();
        listaCitas.add(cita1);
        admin.generarReporte(listaCitas, "PDF");
    }
}
