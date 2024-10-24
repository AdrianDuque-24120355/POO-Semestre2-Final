package menu;

import usuario.medico.Medico;
import hospital.Hospital;
import java.util.Scanner;

public class MenuMedico {

    private Scanner scanner=new Scanner(System.in);
    public int mostrarMenu(){
            System.out.println("\nSISTEMA HOSPITAL\n");
            System.out.println("1. Ver mis consultas actuales"); //Tarea
            System.out.println("2. Ver mis pacientes");
            System.out.println("3. Consultar paciente");
            System.out.println("4. Consultar expediente de paciente");
            System.out.println("5. Completar consulta");
            System.out.println("6. Ver mi información personal"); //Tarea
            System.out.println("7. Salir");

            System.out.println("Selecciona una opcion: ");
            int opcion=scanner.nextInt();
           return opcion;
    }
    public void procesarDatosMenu(int opcion, Medico medico, Hospital hospital){
        switch (opcion){
            case 1:
                hospital.verConsultasMedico(medico.getId());
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.out.println("Ingresa tu ID: ");
                String IdMedico=scanner.nextLine();
                hospital.obtenerMedicoPorId(IdMedico);
                break;
            case 7:
                return;
        }
    }
}
