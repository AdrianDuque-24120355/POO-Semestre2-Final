package hospital;

import consulta.Consulta;
import consultorio.Consultorio;
import java.util.ArrayList;
import medico.Medico;
import paciente.Paciente;


public class Hospital {
    public ArrayList <Paciente> listaPacientes= new ArrayList<>();
    public ArrayList <Medico> listaMedico= new ArrayList<>();
    public ArrayList <Consulta> listaConsulta= new ArrayList<>();
    public ArrayList <Consultorio> listaConsultorio= new ArrayList<>();
    
    public void registrarPaciente(Paciente paciente){
        this.listaPacientes.add(paciente);
    }
    
    public void registrarMedico(Medico medico){
        this.listaMedico.add(medico);
    }
    
     public void registrarConsulta(Consulta consulta){
        if (!validarDisponibilidadFechaConsulta(consulta.getFechaHora(), consulta.getNumeroConsultorio())){
            System.out.println("Ya existe una consulta registrada en esta fecha");
            return;
        }
        this.listaConsulta.add(consulta);
    }
      public void registrarConsultorio(Consultorio consultorio){
        this.listaConsultorio.add(consultorio);
    }
      private boolean validarDisponibilidadFechaConsulta(String fechaDeseada, int NumeroConsultorio){
          for (Consulta consulta: this.listaConsulta){
              if (consulta.getFechaHora().equals (fechaDeseada) && NumeroConsultorio==consulta.getNumeroConsultorio()){
                  return false;
          }
      }
      return true;
}
}