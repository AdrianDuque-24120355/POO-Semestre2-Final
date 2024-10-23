package menu;
import usuario.Usuario;
import usuario.admin.Admin;
import hospital.Hospital;
import java.io.IOException;
import java.util.Scanner;
import usuario.medico.Medico;
import usuario.paciente.Paciente;
import usuario.utils.Rol;


    public class Menu {
        int opcion = 0;
        private Scanner scanner = new Scanner(System.in);
        private Hospital hospital = new Hospital();


        public void login() throws IOException {
            int intentosMaximos = 5, intentosUsuario = 0;

            while (intentosUsuario < intentosMaximos) {
                System.out.println("Bienvenido");
                System.out.println("Inicia sesión para continuar");

                System.out.println("Ingresa tu usuario");
                String usuario = scanner.nextLine();

                System.out.println("Ingresa tu contraseña");
                String contraseña = scanner.nextLine();

                Usuario usuarioEnSesion = hospital.validarInicioSesion(usuario, contraseña);

                if (usuarioEnSesion instanceof Usuario) {
                    if (usuarioEnSesion.getRol() == Rol.PACIENTE) {
                        Paciente pacienteEnSesion = (Paciente) usuarioEnSesion;
                        MenuPaciente menuPaciente=new MenuPaciente();
                        int opcion= 0;
                        while(opcion!=4){
                            opcion= menuPaciente.mostrarMenu();
                            menuPaciente.procesarDatosMenu(opcion, pacienteEnSesion, hospital);
                        }
                        intentosUsuario = 0;
                    } else if (usuarioEnSesion.getRol() == Rol.MEDICO) {
                       Medico medicoEnSesion = (Medico) usuarioEnSesion;
                       MenuMedico menuMedico=new MenuMedico();
                       int opcion=0;
                       while(opcion!=7){
                           opcion= menuMedico.mostrarMenu();
                           menuMedico.procesarDatosMenu(opcion, medicoEnSesion, hospital);
                       }
                        intentosUsuario = 0;
                    } else {
                        Admin adminEnSesion = (Admin) usuarioEnSesion;
                        MenuAdministrador menuAdministrador=new MenuAdministrador();
                        int opcion=0;
                        while(opcion!=13){
                            opcion= menuAdministrador.mostrarMenu();
                            menuAdministrador.procesarDatosMenu(opcion, adminEnSesion, hospital);
                        }
                        intentosUsuario = 0;
                    }
                } else {
                    intentosUsuario = mostrarErrorInicioSesion(intentosUsuario);
                }
            }
        }

        private int mostrarErrorInicioSesion(int intentosUsuario) {
            System.out.println("Usuario o contraseña incorrectos, intenta de nuevo");
            return intentosUsuario + 1;
        }
    }

