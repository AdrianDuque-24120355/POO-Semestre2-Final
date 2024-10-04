package consulta;

import consultorio.Consultorio;
import java.time.LocalDate;
import java.time.LocalDateTime;
import Usuario.medico.Medico;
import Usuario.paciente.Paciente;



public class Consulta {
    public String id;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;

    public Consulta(String id, LocalDateTime fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }


    public String mostrarInformacion(){
        String info=String.format("Id: %s, fecha: %s, ID paciente: %s, nombre paciente: %s, ID medico: %s, nombre medico: %s, piso consultorio %s", 
                id, 
                fechaHora, 
                paciente.getId(), 
                paciente.getNombre(),
                medico.getId(),
                medico.getNombre(),
                consultorio.getPiso());
        return info;
    }
}