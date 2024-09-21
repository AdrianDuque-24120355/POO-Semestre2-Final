package hospital;

import consulta.Consulta;
import consultorio.Consultorio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
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
      public String generarIDPaciente(){
          //P-[alo actual]-[mes actual]- {longitude pacientes +1]{1, 100000}
          Random random=new Random();
          LocalDate fecha=LocalDate.now();
          int anoActual= fecha.getYear();
          int mesActual= fecha.getMonthValue();
          int longitudPacientesMasUno=this.listaPacientes.size()+1;
          int numeroAleatorio=random.nextInt(1, 100000);
          
          String id = String.format("P%d%d%d%d", anoActual, mesActual, longitudPacientesMasUno, numeroAleatorio);
          return id;
      }
      public void MostrarPacientes(){
          System.out.println("***Pacientes del Hospital***");
          for (Paciente paciente: this.listaPacientes){
              System.out.println(paciente.MostrarDatos());
          }
      }
      public void mostrarPacientePorId(String id){
           Optional<Paciente> pacienteEncontrado = this.listaPacientes.stream().filter(paciente -> paciente.getId().equals(id)).findFirst();
           
           if (pacienteEncontrado.isPresent()){
               System.out.println(pacienteEncontrado.get().MostrarDatos());
           }
           else {
               System.out.println("No se encontró paciente");
           }
          /*for (Paciente paciente: this.listaPacientes){
              if (paciente.getId().equals(id)){
                  System.out.println(paciente.MostrarDatos());
                  return;
              }
          }
          System.out.println("Paciente no encontrado");*/
      }
      public String generarIDMedico(String apellido, int AñoNacimiento){
          //M-{Primeras 2 letras de su apellido}-{ultimo digito de su año de nacimiento}-{año actual}-{numero aleatorio entre 50 y 7000000} - {longitud de la lista de medicos +1}
          Random random=new Random();
          LocalDate fecha=LocalDate.now();
          String DosLetrasApellido=apellido.length()>=2 ? apellido.substring(0, 2): apellido;
          int UltimoDigito=AñoNacimiento % 10;
          int AnoActualM=fecha.getYear();
          int numeroAleatorio=random.nextInt(1, 699951)+50;
          int longitudListaMedico=this.listaMedico.size()+1;
          
          String idM = String.format("M%s%d%d%d%d", DosLetrasApellido, UltimoDigito, AnoActualM, numeroAleatorio, longitudListaMedico);
          return idM;
      }
      public void MostrarMedicos(){
          System.out.println("***Medicos del Hospital***");
          for (Medico medico: this.listaMedico){
              System.out.println(medico.MostrarDatos());
          }
      }
           public void mostrarMedicoPorId(String id){
           Optional<Medico> medicoEncontrado = this.listaMedico.stream().filter(medico -> medico.getId().equals(id)).findFirst();
           
           if (medicoEncontrado.isPresent()){
               System.out.println(medicoEncontrado.get().MostrarDatos());
           }
           else {
               System.out.println("No se encontró medico");
           }
}
           public String generarIDConsultorio(){
               //C-{longitud de la lista de consultorios+1}-{dia actual}-{año actual}-{numero aleatorio entre 1 y 500000}
               Random random=new Random();
               LocalDate fecha=LocalDate.now();
               int longitudListaConsultorio=this.listaConsultorio.size()+1;
               int DiaActual=fecha.getDayOfYear();
               int AnioActual=fecha.getYear();
               int numeroAleatorio=random.nextInt(1, 5000001);
               
               String idCo = String.format("C%d%d%d%d", longitudListaConsultorio, DiaActual, AnioActual, numeroAleatorio);
               return idCo;
           }
      public void MostrarConsultorios(){
          System.out.println("***Consultorios del Hospital***");
          for (Consultorio consultorio: this.listaConsultorio){
              System.out.println(consultorio.MostrarDatos());
          }
      }
       public void mostrarConsultorioPorId(String id){
           Optional<Consultorio> consultorioEncontrado = this.listaConsultorio.stream().filter(consultorio -> consultorio.getId().equals(id)).findFirst();
           
           if (consultorioEncontrado.isPresent()){
               System.out.println(consultorioEncontrado.get().MostrarDatos());
           }
           else {
               System.out.println("No se encontró consultorio");
           }
           }
}