package hospital;

import usuario.Usuario;
import usuario.admin.Admin;
import consulta.Consulta;
import consultorio.Consultorio;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import usuario.medico.Medico;
import usuario.paciente.Paciente;
import consulta.utils.Status;
import expediente.Expediente;

public class Hospital {
    Scanner scanner=new Scanner(System.in);
    public ArrayList <Usuario> listaUsuarios=new ArrayList<>();
    public ArrayList <Paciente> listaPacientes= new ArrayList<>();
    public ArrayList <Medico> listaMedico= new ArrayList<>();
    public ArrayList <Admin> listaAdmin= new ArrayList<>();
    public ArrayList <Consulta> listaConsulta= new ArrayList<>();
    public ArrayList <Consultorio> listaConsultorio= new ArrayList<>();
    private ValidarHospital validador=new ValidarHospital();

    public Hospital(){
        Admin administrador=new Admin(4000, 4, "AFFA", "JA123", "Jose", "Lopez", "4432", LocalDate.now(), "YOMAMA");
        this.listaUsuarios.add(administrador);
        this.listaAdmin.add(administrador);
    }

    public void registrarPaciente(Paciente paciente){
        this.listaUsuarios.add(paciente);
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico){
        this.listaMedico.add(medico);
        this.listaUsuarios.add(medico);
    }
    public String generarIDConsulta(){
        int diaActual=LocalDate.now().getDayOfMonth();
        int numeroAl= new Random().nextInt(100000-50)+50;
        return String.format("CO-%d-%d-%d", listaConsultorio.size()+1, numeroAl, diaActual);
    }

    public void registrarConsulta(Consulta consulta){
        if (!validador.validarDisponibilidadFechaConsulta(consulta.getFechaHora(), consulta.getConsultorio().getnumeroConsultorio(), this.listaConsulta)){
            System.out.println("Ya existe una consulta registrada en esta fecha");

        }
        if (!validador.validarDisponibilidadMedico(consulta.getFechaHora(), consulta.getMedico().getId(), this.listaConsulta)){
            System.out.println("El medico no tiene disponibilidad para esa fecha");

        }
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
    public Paciente obtenerPacientePorID(String idPaciente){
        return listaPacientes.stream().filter(p -> p.getId().equals(idPaciente)).findFirst().orElse(null);
    }
    public boolean telefonoPaciente(String telefono){
        for (Paciente paciente: this.listaPacientes){
            if(paciente.getTelefono().contains(telefono))
                return false;
        }
        return true;
    }


    public void mostrarPacientePorId(String idPaciente){
        Paciente paciente =listaPacientes.stream().filter(p -> p.getId().equals(idPaciente)).findFirst().orElse(null);

        if (paciente != null){
            System.out.println(paciente.MostrarDatos());
        }
        else {
            System.out.println("No se encontró paciente");
        }
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
    public Medico obtenerMedicoPorId(String idMedico){
        return listaMedico.stream().filter(m -> m.getId().equals(idMedico)).findFirst().orElse(null);
    }
    public boolean telefonoMedico(String telefono){
        for (Medico medico: this.listaMedico){
            if(medico.getTelefono().contains(telefono))
                return false;
        }
        return true;
    }
    public boolean RFCMedico(String RFC){
        for (Medico medico: this.listaMedico){
            if(medico.getRFC().contains(RFC))
                return false;
        }
        return true;
    }
    public Medico obtenerTelefonoMedico(String telefonoMedico){
        return listaMedico.stream().filter(p -> p.getTelefono().equals(telefonoMedico)).findFirst().orElse(null);
    }
    public void mostrarMedicoPorId(String idMedico){
        Medico medico =listaMedico.stream().filter(p -> p.getId().equals(idMedico)).findFirst().orElse(null);

        if (medico !=null){
            System.out.println(medico.MostrarDatos());
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
    public Consultorio obtenerConsultorioPorID(String idConsultorio){
        return listaConsultorio.stream().filter(c -> c.getId().equals(idConsultorio)).findFirst().orElse(null);
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
    public boolean validarFechaConsulta(LocalDateTime fechaDeseada){
        return this.validador.validarfechaCorrecta(fechaDeseada);
    }

    public void mostrarConsultar(){
        if (this.listaConsulta.isEmpty()){
            System.out.println("No se cuenta con consultar registradas");
            return;
        }
        System.out.println("--- Lista Consultas ---");
        for (Consulta consulta : this.listaConsulta){
            System.out.println(consulta.mostrarInformacion());
        }
    }
    public Usuario validarInicioSesion(String idUsuario, String contraseña){
        for (Usuario usuario: this.listaUsuarios){
            if (usuario.getId().equals(idUsuario) && usuario.getContrasenia().equals(contraseña)){
                return usuario;
            }
        }
        return null;
    }
    public void verConsultasPaciente(String idPaciente){
        boolean existenConsultas=false;
        System.out.println("***MIS CONSULTAS***");

        for (Consulta consulta: this.listaConsulta){
            if (idPaciente.equals(consulta.getPaciente().getId())&&consulta.getstatus()==Status.PENDIENTE){
                existenConsultas=true;
            }
        }
        if (!existenConsultas){
            System.out.println("No tienes consultas agendadas");
        }
    }
    public void verConsultasMedico(String idMedico){
        boolean existenConsultas=false;
        System.out.println("***MIS CONSULTAS***");

        for (Consulta consulta: this.listaConsulta){
            if (idMedico.equals(consulta.getMedico().getId())&&consulta.getstatus()==Status.PENDIENTE){
                existenConsultas=true;
            }
        }
        if (!existenConsultas){
            System.out.println("No tienes consultas agendadas");
        }
    }
    public void eliminarConsultaporId(String idConsulta){
        for (Consulta consulta: this.listaConsulta){
            if (consulta.getId().equals(idConsulta)){
                this.listaConsulta.remove(consulta);
                return;
            }
        }
    }
    public Consulta obtenerConsultaporID(String idConsulta){
        for (Consulta consulta:this.listaConsulta){
            if(consulta.getId().equals(idConsulta)){
                return consulta;
            }
        }
        return null;
    }
    public void generarExpedienteConsulta(String idConsulta, String idPaciente) {
        Scanner scanner = new Scanner(System.in);
        Consulta consulta = this.obtenerConsultaporID(idConsulta);
        if (consulta == null) {
            System.out.println("No existe una consulta con el ID proporcionado");
            return;
        }
        Paciente paciente = this.obtenerPacientePorID(idPaciente);
            if (paciente == null) {
                System.out.println();
                return;
            }



        consulta.setStatus(Status.TERMINADA);
        this.eliminarConsultaporId(idConsulta);


        System.out.println("Ingresa las observaciones finales de la consulta");
        String observaciones=scanner.nextLine();
        Expediente expediente=new Expediente (consulta, observaciones);
        paciente.registrarExpediente(expediente);
        System.out.println("Finalizada");
    }
    public void mostrarAdminPorId(String idAdmin){
        Admin admin =listaAdmin.stream().filter(p -> p.getId().equals(idAdmin)).findFirst().orElse(null);

        if (admin != null){
            System.out.println(admin.MostrarDatos());
        }
        else {
            System.out.println("No se encontró paciente");
        }
    }
}
