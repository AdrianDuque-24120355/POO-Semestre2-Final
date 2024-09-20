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
    private ValidarHospital validador=new ValidarHospital();
    
    public void registrarPaciente(Paciente paciente){
        this.listaPacientes.add(paciente);
    }
    
    public void registrarMedico(Medico medico){
        this.listaMedico.add(medico);
    }
    
     public void registrarConsulta(Consulta consulta){
        if (!validador.validarDisponibilidadFechaConsulta(consulta.getFechaHora(), consulta.getConsultorio().getnumeroConsultorio(), this.listaConsulta)){
            System.out.println("Ya existe una consulta registrada en esta fecha");
            return;
        }
        if (!validador.validarDisponibilidadMedico(consulta.getFechaHora(), consulta.getMedico().getId(), this.listaConsulta))
             System.out.println("El medico no tiene disponibilidad para esa fecha");
        this.listaConsulta.add(consulta);
    }
      public void registrarConsultorio(Consultorio consultorio){
        this.listaConsultorio.add(consultorio);
    }
      public void MostrarPacientes(){
          System.out.println("***Pacientes del Hospital***");
          for (Paciente paciente: this.listaPacientes){
              System.out.println(paciente.MostrarDatos());
          }
      }
      public void MostrarMedicos(){
          System.out.println("***Medicos del Hospital***");
          for (Medico medico: this.listaMedico){
              System.out.println(medico.MostrarDatos());
          }
}
      public void MostrarConsultorios(){
          System.out.println("***Consultorios del Hospital***");
          for (Consultorio consultorio: this.listaConsultorio){
              System.out.println(consultorio.MostrarDatos());
          }
      }
}