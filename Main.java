package com.mycompany.main6;

import java.util.Scanner;
import paciente.Paciente;
import medico.Medico;
import consultorio.Consultorio;
import consulta.Consulta;
import hospital.Hospital;
import java.io.IOException;

public class Main6 {

    public static void main(String[] args) throws IOException {
        int opcion=0;
        Hospital hospital=new Hospital();
        Scanner scanner= new Scanner(System.in);
         while (opcion != 9) {
            System.out.println("\n*** BIENVENIDO ***");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar medico");
            System.out.println("3. Registrar consultorio");
            System.out.println("4. Registrar consulta");
            System.out.println("5. Mostrar pacientes");
            System.out.println("6. Mostrar medico");
            System.out.println("7. Mostrar consultorios");
            System.out.println("8. Mostrar consultas");
            System.out.println("9. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre del paciente: ");
                    String nombre=scanner.nextLine();
                    System.out.println("Ingresa los apellidos del paciente: ");
                    String apellido=scanner.nextLine();
                    System.out.println("Ingresa la fecha de nacimiento del paciente: ");
                    String FechaNacimiento=scanner.nextLine();
                    System.out.println("Ingresa el telefono del paciente: ");
                    String telefono=scanner.nextLine();
                    System.out.println("Ingresa el tipo de sangre del paciente: ");
                    String tipoSangre=scanner.nextLine();
                    System.out.println("Ingresa el sexo del paciente: ");
                    char sexo=(char) System.in.read();
                    
                    System.in.read();
                    Paciente paciente=new Paciente(nombre, apellido, FechaNacimiento, telefono, tipoSangre, sexo);
                    hospital.registrarPaciente(paciente);
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del medico: ");
                    String nombreM=scanner.nextLine();
                    System.out.println("Ingresa los apellidos del medico: ");
                    String apellidoM=scanner.nextLine();
                    System.out.println("Ingresa el telefono del medico: ");
                    String telefonoM=scanner.nextLine();
                    System.out.println("Ingresa el RFC del medico: ");
                    String RFC=scanner.nextLine();
                    Medico medico=new Medico(nombreM, apellidoM, telefonoM, RFC);
                    hospital.registrarMedico(medico);
                    break;
                case 3:
                    System.out.println("Ingresa el numero de piso: ");
                    int piso=scanner.nextInt();
                    System.out.println("Ingresa el numero de consultorio: ");
                    int numeroConsultorio=scanner.nextInt();
                    Consultorio consultorio=new Consultorio(piso, numeroConsultorio);
                    hospital.registrarConsultorio(consultorio);
                    break;
                case 4:
                   
                    
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
                    break;
                case 9:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}