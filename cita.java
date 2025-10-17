public class cita {

    private String fecha;

    private String hora;

    private String medico;

    private String lugar;

    private String paciente;

    private String estado;
 
    private String diagnostico;

    private String tratamiento;

    private String observaciones;
 
    public cita(String fecha, String hora, String medico, String lugar, String paciente) {

        this.fecha = fecha;

        this.hora = hora;

        this.medico = medico;

        this.lugar = lugar;

        this.paciente = paciente;

        this.estado = "Agendada";

    }
 
    public String getDatos() {

        return "Cita con " + medico + " el " + fecha + " a las " + hora +

                " en " + lugar + " - Paciente: " + paciente + " - Estado: " + estado;

    }
 
    public void setEstado(String estado) {

        this.estado = estado;

    }
 
    public String getEstado() {

        return estado;

    }
 
    public String getPaciente() {

        return paciente;

    }
 
    // === Diagnóstico ===

    public void registrarDiagnostico(String diagnostico, String tratamiento, String observaciones) {

        this.diagnostico = diagnostico;

        this.tratamiento = tratamiento;

        this.observaciones = observaciones;

        System.out.println("🩺 Diagnóstico registrado correctamente para el paciente " + paciente);

    }
 
    public String getHistorialClinico() {

        if (diagnostico == null) {

            return "Sin diagnóstico registrado.";

        }

        return "Diagnóstico: " + diagnostico + "\nTratamiento: " + tratamiento + "\nObservaciones: " + observaciones;

    }
 
    public String getResumenCita() {

        return "Fecha: " + fecha + " - Hora: " + hora + " - Médico: " + medico + " - Lugar: " + lugar;

    }

}

 