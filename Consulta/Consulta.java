package consulta;

import consultorio.Consultorio;
import java.time.LocalDate;
import java.time.LocalDateTime;
import medico.Medico;
import paciente.Paciente;



public class Consulta {
    public int id, numeroConsultorio;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;

    public Consulta(int id, LocalDateTime fechaHora, Paciente paciente, Medico medico, Consultorio consultorio, int numeroConsultorio) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
        this.numeroConsultorio = numeroConsultorio;
    }

    public int getId() {
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

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }
}