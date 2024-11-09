import exceptions.HabitacionNoDisponibleException;
import habitacion.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

public class Helper {
    ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();

    public void agregarHabitacion() {
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                Habitacion habitacion = new Habitacion("Individual", 50.0, true);
                listaHabitaciones.add(habitacion);
            } else if (i == 1) {
                Habitacion habitacion = new Habitacion("Doble", 75.0, true);
                listaHabitaciones.add(habitacion);
            } else {
                Habitacion habitacion = new Habitacion("Suite", 100.0, true);
                listaHabitaciones.add(habitacion);
            }
        }
    }

    public void mostrarHabitaciones() {
        for (Habitacion habitacion : this.listaHabitaciones) {
            System.out.println(habitacion.mostrarDetalles());
        }
    }

    public double reservarHabitacion(int noches) throws HabitacionNoDisponibleException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el número de habitación: ");
        System.out.println("1. Individual");
        System.out.println("2. Doble");
        System.out.println("3. Suite");
        int opcion = reader.nextInt();
        double precio = 0;

        switch (opcion) {
            case 1:
                if (listaHabitaciones.get(0).getDisponibilidad() == false) {
                    throw new HabitacionNoDisponibleException("La habitación no se encuentra disponible");
                }
                listaHabitaciones.get(0).setDisponibilidad(false);
                precio = listaHabitaciones.get(0).getPrecioPorNoche() * noches;
                break;
            case 2:
                if (listaHabitaciones.get(0).getDisponibilidad() == false) {
                    throw new HabitacionNoDisponibleException("La habitación no se encuentra disponible");
                }
                listaHabitaciones.get(1).setDisponibilidad(false);
                precio = listaHabitaciones.get(1).getPrecioPorNoche() * noches;
                break;
            default:
                if (listaHabitaciones.get(0).getDisponibilidad() == false) {
                    throw new HabitacionNoDisponibleException("La habitación no se encuentra disponible");
                }
                listaHabitaciones.get(2).setDisponibilidad(false);
                precio = listaHabitaciones.get(2).getPrecioPorNoche() * noches;
        }
        return precio;
    }

    public void liberarHabitacion() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el número de habitación: ");
        System.out.println("1. Individual");
        System.out.println("2. Doble");
        System.out.println("3. Suite");
        int opcion = reader.nextInt();
        switch (opcion) {
            case 1:
                listaHabitaciones.get(0).setDisponibilidad(true);
                break;
            case 2:
                listaHabitaciones.get(1).setDisponibilidad(true);
                break;
            default:
                listaHabitaciones.get(2).setDisponibilidad(true);
        }
        System.out.println("La habitación ha sido liberada y se encuentra disponible nuevamente");
    }
}


