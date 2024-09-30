package com.mycompany.main6;

import java.util.Scanner;
import paciente.Paciente;
import medico.Medico;
import consultorio.Consultorio;
import consulta.Consulta;
import hospital.Hospital;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main6 {

    public static void main(String[] args) throws IOException {
        int opcion=0;
        Hospital hospital=new Hospital();
        Scanner scanner= new Scanner(System.in);
         while (opcion != 12) {
            System.out.println("\n*** BIENVENIDO ***");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar medico");
            System.out.println("3. Registrar consultorio");
            System.out.println("4. Registrar consulta");
            System.out.println("5. Mostrar pacientes");
            System.out.println("6. Mostrar medico");
            System.out.println("7. Mostrar consultorios");
            System.out.println("8. Mostrar consultas");
            System.out.println("9. Mostrar paciente por ID");
            System.out.println("10. Mostrar medico por ID");
            System.out.println("11. Mostrar consultorio por ID");
            System.out.println("12. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
           
                    String id=hospital.generarIDPaciente();
                    System.out.println("Ingresa el nombre del paciente: ");
                    String nombre=scanner.nextLine();
                    System.out.println("Ingresa los apellidos del paciente: ");
                    String apellido=scanner.nextLine();
                    System.out.println("Ingresa el año de nacimiento del paciente: ");
                    int anio=scanner.nextInt();
                    System.out.println("Ingresa el mes de nacimiento del paciente: ");
                    int mes=scanner.nextInt();
                    System.out.println("Ingresa el dia de nacimiento del paciente: ");
                    int dia=scanner.nextInt();
                    LocalDate FechaNacimiento=LocalDate.of(anio, mes, dia);
                    System.out.println("Ingresa el telefono del paciente: ");
                    scanner.nextLine();
                    
                    String telefono=scanner.nextLine();
                    while (hospital.telefonoPaciente(telefono)==false){
                        System.out.println("Ingresa otro numero de telefono");
                        telefono=scanner.nextLine();
                    }
                    System.out.println("Ingresa el tipo de sangre del paciente: ");
                    String tipoSangre=scanner.nextLine();
                    System.out.println("Ingresa el sexo del paciente: ");
                    char sexo=(char) System.in.read();
                    
                    System.in.read();
                    Paciente paciente=new Paciente(id, nombre, apellido, FechaNacimiento, telefono, tipoSangre, sexo);
                    hospital.registrarPaciente(paciente);
                    
                    System.out.println("\nPaciente registrado correctamente");
                    break;
                case 2:
                    
                    System.out.println("Ingresa el nombre del medico: ");
                    String nombreM=scanner.nextLine();
                    System.out.println("Ingresa los apellidos del medico: ");
                    String apellidoM=scanner.nextLine();
                    System.out.println("Ingresa el telefono del medico: ");
                    String telefonoM=scanner.nextLine();
                    while (hospital.telefonoMedico(telefonoM)==false){
                        System.out.println("Ingresa otro numero de telefono");
                        telefonoM=scanner.nextLine();
                    }
                    System.out.println("Ingresa el RFC del medico: ");
                    String RFC=scanner.nextLine();
                    while (hospital.RFCMedico(RFC)==false){
                        System.out.println("Ingresa otro RFC");
                        RFC=scanner.nextLine();
                    }
                    System.out.println("Ingresa el año de nacimiento del medico");
                    int anioMed=scanner.nextInt();
                    System.out.println("Ingresa el mes de nacimiento del medico");
                    int mesMed=scanner.nextInt();
                    System.out.println("Ingresa el dia de nacimiento del medico");
                    int diaMed=scanner.nextInt();
                    LocalDate AñoNacimiento= LocalDate.of(anioMed, mesMed, diaMed);
                    String idM=hospital.generarIDMedico(apellidoM, anioMed);
                    Medico medico=new Medico(idM, nombreM, apellidoM, telefonoM, RFC, AñoNacimiento);
                    hospital.registrarMedico(medico);
                    break;
                case 3:
                    String idCo = hospital.generarIDConsultorio();
                    System.out.println("Ingresa el numero de piso: ");
                    int piso=scanner.nextInt();
                    System.out.println("Ingresa el numero de consultorio: ");
                    int numeroConsultorio=scanner.nextInt();
                    Consultorio consultorio=new Consultorio(idCo, piso, numeroConsultorio);
                    hospital.registrarConsultorio(consultorio);
                    break;
                case 4:
                    System.out.println("\n Seleccionaste la opción para registrar una consulta");
                    //int idConsulta=1;
                    String idConsulta= hospital.generarIDConsulta();
                    LocalDateTime fechaConsulta=null;
                    do{
                    System.out.println("Ingresa el dia de la consulta deseada: ");
                    int diaConsulta=scanner.nextInt();
                    System.out.println("Ingresa el mes de la consulta deseada: ");
                    int mesConsulta=scanner.nextInt();
                    System.out.println("Ingresa el año de la consulta deseada: ");
                    int anioConsulta=scanner.nextInt();
                    System.out.println("Ingresa la hora de la consulta: ");
                    int horaConsulta=scanner.nextInt();
                    System.out.println("Ingresa los minutos de la consulta: ");
                    int minutosConsulta=scanner.nextInt();
                    fechaConsulta=LocalDateTime.of(anioConsulta, mesConsulta, diaConsulta,horaConsulta, minutosConsulta);
                    if (!hospital.validarFechaConsulta(fechaConsulta)){
                        System.out.println("La fecha no puede estar en el pasado");
                    }
                    }while(hospital.validarFechaConsulta(fechaConsulta)!= true);
                    Paciente pacienteConsulta=null;
                    
                    while(pacienteConsulta == null){
                    System.out.println("Ingresa el id del paciente: ");
                    String pacienteId=scanner.nextLine();
                    pacienteConsulta= hospital.obtenerPacientePorID(pacienteId); 
                    if (pacienteConsulta==null){
                        System.out.println("\nPaciente no encontrado, intenta de nuevo\n");
                    }
                    }
                    Medico medicoConsulta=null;
                    
                    while(medicoConsulta==null){
                    System.out.println("Ingresa el id del medico: ");
                    String medicoId=scanner.nextLine();
                    
                    medicoConsulta= hospital.obtenerMedicoPorId(medicoId); 
                    
                    if (medicoConsulta==null){
                        System.out.println("\nPaciente no encontrado, intenta de nuevo\n");
                    }
                    }
                    Consultorio consultorioConsulta=null;
                    
                    while(consultorioConsulta == null){
                    System.out.println("Ingresa el id del consultorio: ");
                    String iDConsultorio=scanner.nextLine();
                    
                    consultorioConsulta= hospital.obtenerConsultorioPorID(iDConsultorio); 
                    
                    if (consultorioConsulta==null){
                        System.out.println("\nPaciente no encontrado, intenta de nuevo\n");
                    }
                    }                    
                    
                    Consulta consulta=new Consulta(idConsulta, fechaConsulta, pacienteConsulta, medicoConsulta, consultorioConsulta);
                    hospital.registrarConsulta(consulta);
                    
                    System.out.println(hospital.listaConsulta.get(0));
                    break;
                case 5:
                    hospital.MostrarPacientes();
                    break;
                case 6:
                    hospital.MostrarMedicos();
                    break;
                case 7:
                    hospital.MostrarConsultorios();
                    break;
                case 8:
                    hospital.mostrarConsultar();
                    break;
                case 9:
                    System.out.println("\nMostrar Paciente");
                    
                    System.out.println("Ingresa el ID del paciente que deseas buscar");
                    String idPaciente = scanner.nextLine();
                    
                    hospital.mostrarPacientePorId(idPaciente);
                    break;
                case 10:
                    System.out.println("\nMostrar Medico");
                    
                    System.out.println("Ingresa el ID del medico que deseas buscar");
                    String idMedico = scanner.nextLine();
                    
                    hospital.mostrarMedicoPorId(idMedico);
                    break;
                case 11:
                    System.out.println("\nMostrar Consultorio");
                    
                    System.out.println("Ingresa el ID del consultorio que deseas buscar");
                    String idConsultorio = scanner.nextLine();
                    hospital.mostrarConsultorioPorId(idConsultorio);
                    break;
                case 12:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}
    

