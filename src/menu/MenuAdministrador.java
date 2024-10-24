package menu;

import usuario.Usuario;
import usuario.admin.Admin;
import usuario.medico.Medico;
import usuario.paciente.Paciente;
import usuario.utils.Rol;
import consulta.Consulta;
import consultorio.Consultorio;
import hospital.Hospital;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdministrador {
    private Scanner scanner = new Scanner(System.in);


    public int mostrarMenu() {
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
        System.out.println("12. Ver datos personales");
        System.out.println("13. Salir");

        System.out.println("Selecciona una opción: ");
        int opcion = scanner.nextInt();
        return opcion;
    }

    public void procesarDatosMenu(int opcion, Admin admin, Hospital hospital) throws IOException {
        switch (opcion) {
            case 1:
                String id = hospital.generarIDPaciente();

                ArrayList<String> datosPaciente = this.obtenerDatosComun(Rol.PACIENTE, hospital);

                String nombre = datosPaciente.get(0);
                String apellido = datosPaciente.get(1);
                LocalDate FechaNacimiento = LocalDate.parse(datosPaciente.get(2));
                String telefono = datosPaciente.get(3);
                String email = datosPaciente.get(4);
                String contraseñaPaciente = datosPaciente.get(5);


                System.out.println("Ingresa el tipo de sangre del paciente: ");
                String tipoSangre = scanner.nextLine();

                System.out.println("Ingresa el sexo del paciente: ");
                char sexo = (char) System.in.read();

                Paciente paciente = new Paciente(id, nombre, apellido, FechaNacimiento, telefono, tipoSangre, sexo, contraseñaPaciente, email, Rol.PACIENTE);
                hospital.registrarPaciente(paciente);
                System.out.println("\nPaciente registrado correctamente");
                break;
            case 2:

                ArrayList<String> datosMedico = this.obtenerDatosComun(Rol.MEDICO, hospital);

                String nombreM = datosMedico.get(0);
                String apellidoM = datosMedico.get(1);
                LocalDate AñoNacimiento = LocalDate.parse(datosMedico.get(2));
                String telefonoM = datosMedico.get(3);
                String emailM = datosMedico.get(4);
                String contraseñaMedico = datosMedico.get(5);

                int anioMed = AñoNacimiento.getYear();

                System.out.println("Ingresa el RFC del medico: ");
                String RFC = scanner.nextLine();
                while (hospital.RFCMedico(RFC) == false) {
                    System.out.println("Ingresa otro RFC");
                    RFC = scanner.nextLine();
                }
                String idM = hospital.generarIDMedico(apellidoM, anioMed);
                Medico medico = new Medico(idM, nombreM, apellidoM, telefonoM, RFC, AñoNacimiento, contraseñaMedico, emailM, Rol.MEDICO);
                hospital.registrarMedico(medico);
                break;
            case 3:
                String idCo = hospital.generarIDConsultorio();
                System.out.println("Ingresa el numero de piso: ");
                int piso = scanner.nextInt();
                System.out.println("Ingresa el numero de consultorio: ");
                int numeroConsultorio = scanner.nextInt();
                Consultorio consultorio = new Consultorio(idCo, piso, numeroConsultorio);
                hospital.registrarConsultorio(consultorio);
                break;
            case 4:
                System.out.println("\n Seleccionaste la opción para registrar una consulta");
                //int idConsulta=1;
                String idConsulta = hospital.generarIDConsulta();
                LocalDateTime fechaConsulta = null;
                do {
                    System.out.println("Ingresa el dia de la consulta deseada: ");
                    int diaConsulta = scanner.nextInt();
                    System.out.println("Ingresa el mes de la consulta deseada: ");
                    int mesConsulta = scanner.nextInt();
                    System.out.println("Ingresa el año de la consulta deseada: ");
                    int anioConsulta = scanner.nextInt();
                    System.out.println("Ingresa la hora de la consulta: ");
                    int horaConsulta = scanner.nextInt();
                    System.out.println("Ingresa los minutos de la consulta: ");
                    int minutosConsulta = scanner.nextInt();
                    fechaConsulta = LocalDateTime.of(anioConsulta, mesConsulta, diaConsulta, horaConsulta, minutosConsulta);
                    if (!hospital.validarFechaConsulta(fechaConsulta)) {
                        System.out.println("La fecha no puede estar en el pasado");
                    }
                } while (hospital.validarFechaConsulta(fechaConsulta) != true);
                Paciente pacienteConsulta = null;

                while (pacienteConsulta == null) {
                    System.out.println("Ingresa el id del paciente: ");
                    String pacienteId = scanner.nextLine();
                    pacienteConsulta = hospital.obtenerPacientePorID(pacienteId);
                    if (pacienteConsulta == null) {
                        System.out.println("\nPaciente no encontrado, intenta de nuevo\n");
                    }
                }
                Medico medicoConsulta = null;

                while (medicoConsulta == null) {
                    System.out.println("Ingresa el id del medico: ");
                    String medicoId = scanner.nextLine();

                    medicoConsulta = hospital.obtenerMedicoPorId(medicoId);

                    if (medicoConsulta == null) {
                        System.out.println("\nPaciente no encontrado, intenta de nuevo\n");
                    }
                }
                Consultorio consultorioConsulta = null;

                while (consultorioConsulta == null) {
                    System.out.println("Ingresa el id del consultorio: ");
                    String iDConsultorio = scanner.nextLine();

                    consultorioConsulta = hospital.obtenerConsultorioPorID(iDConsultorio);

                    if (consultorioConsulta == null) {
                        System.out.println("\nPaciente no encontrado, intenta de nuevo\n");
                    }
                }

                Consulta consulta = new Consulta(idConsulta, fechaConsulta, pacienteConsulta, medicoConsulta, consultorioConsulta);
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
                System.out.println("Ingresa el ID del Admin que quieres buscar");
                scanner.nextLine();
                String idAdmin = scanner.nextLine();
                hospital.mostrarAdminPorId(idAdmin);
            case 13:
                System.out.println("Hasta luego");
                return;
        }
    }

    private ArrayList<String> obtenerDatosComun(Rol rol, Hospital hospital) {
        String tipoUsuario = rol == Rol.PACIENTE ? "paciente" : rol == Rol.MEDICO ? "medico" : "administrador";
        ArrayList<String> datosEnComun = new ArrayList();

        System.out.println("Ingresa el nombre del " + tipoUsuario + " :");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        datosEnComun.add(nombre);

        System.out.println("Ingresa el apellido del " + tipoUsuario + " : ");
        String apellido = scanner.nextLine();
        datosEnComun.add(apellido);

        datosEnComun.add(obtenerFechaNacimiento(tipoUsuario));

        System.out.println("Ingresa el telefono del "+tipoUsuario+" : ");
        scanner.nextLine();
        String numeroTelefono = scanner.nextLine();
        while (hospital.telefonoUsuario(numeroTelefono) == false) {
            System.out.println("Ingresa otro telefono");
            numeroTelefono= scanner.nextLine();
        }
        datosEnComun.add(numeroTelefono);

        System.out.println("Ingresa el email del "+tipoUsuario+" : ");
        String email = scanner.nextLine();
        while (hospital.emailUsuario(email) == false) {
            System.out.println("Ingresa otro email");
            email= scanner.nextLine();
        }
        datosEnComun.add(email);


        System.out.println("Ingresa la contraseña del " + tipoUsuario + ": ");
        String contraseña = scanner.nextLine();
        datosEnComun.add(contraseña);

        return datosEnComun;
    }

    private boolean validarTelefonoRepetido(ArrayList<? extends Usuario> listaUsuarios, String telefono) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getTelefono().equals(telefono)) {
                System.out.println("Ya existe un usuario con ese teléfono, intenta de nuevo\n");
                return false;
            }
        }
        return true;
    }


    private boolean validarEmailRepetido(ArrayList<? extends Usuario> listaUsuarios, String email) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEmail().equals(email)) {
                System.out.println("Ya existe un usuario con ese teléfono, intenta de nuevo\n");
                return false;
            }
        }
        return true;
    }

    private String obtenerFechaNacimiento(String tipoUsuario) {
        boolean esFechaValida = false;
        LocalDate FechaNacimiento = LocalDate.now();
        while (!esFechaValida) {
            System.out.println("Ingresa el año de nacimiento del " + tipoUsuario + ": ");
            int anio = scanner.nextInt();

            System.out.println("Ingresa el mes de nacimiento del " + tipoUsuario + ": ");
            int mes = scanner.nextInt();

            System.out.println("Ingresa el dia de nacimiento del " + tipoUsuario + ": ");
            int dia = scanner.nextInt();

            FechaNacimiento = LocalDate.of(anio, mes, dia);

            if (FechaNacimiento.isAfter(LocalDate.now())) {
                System.out.println("La fecha de nacimiento no puede ser posterior al día de hoy");
            } else {
                esFechaValida = true;
            }
        }
        return FechaNacimiento.toString();
    }
}


