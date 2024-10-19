package menu;

import usuario.paciente.Paciente;
import hospital.Hospital;
import java.util.Scanner;

public class MenuPaciente {

    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\nSISTEMA HOSPITAL\n");
        System.out.println("1. Ver mis consultas");
        System.out.println("2. Ver información personal"); //Tarea
        System.out.println("3. Ver el expediente");
        System.out.println("4. Salir");

        System.out.println("Selecciona una opcion: ");
        int opcion = scanner.nextInt();
        return opcion;
    }


    public void procesarDatosMenu(int opcion, Paciente paciente, Hospital hospital) {
        switch (opcion) {
            case 1:
                hospital.verConsultasPaciente(paciente.getId());
                break;
            case 2:
                System.out.println("Ingresa tu ID: ");
                String IdPaciente = scanner.nextLine();
                hospital.obtenerPacientePorID(IdPaciente);
                break;
        }
    }
}


