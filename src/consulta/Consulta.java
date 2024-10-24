package consulta;

import consultorio.Consultorio;
import java.time.LocalDateTime;
import usuario.medico.Medico;
import usuario.paciente.Paciente;
import consulta.utils.Status;



public class Consulta {
    public String id;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;
    public Status status;

    public Consulta(String id, LocalDateTime fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
        this.status=Status.PENDIENTE;
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
    public Status getstatus(){
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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