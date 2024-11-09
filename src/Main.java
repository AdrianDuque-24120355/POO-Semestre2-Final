import exceptions.NumeroDeNochesInvalidoException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumeroDeNochesInvalidoException {
        Scanner read=new Scanner(System.in);
        Helper helper=new Helper();
        helper.agregarHabitacion();
        int opcion=0;

        do{
        System.out.println("Ingresa la acción que desea realizar");
        System.out.println("1. Mostrar detalles de habitación");
        System.out.println("2. Realizar una reserva");
        System.out.println("3. Liberar una habitación");
        System.out.println("4. Salir" );
        opcion=read.nextInt();
            switch(opcion){
                case 1:
                    helper.mostrarHabitaciones();
                    break;
                case 2:
                    System.out.println("Ingresa el número de noches a reservar");
                    int noches=read.nextInt();
                    if(noches<0){
                        throw new NumeroDeNochesInvalidoException("El número de noches es inválido");
                    }
                    double reserva=helper.reservarHabitacion(noches);
                    System.out.println("Costo total de la reserva: "+reserva);
                    break;
                case 3:
                    helper.liberarHabitacion();
                    break;
                default:
                    System.out.println("Esa opción no existe");
            }
        }while(opcion!=4);
        System.out.println("Usted salió del programa");
    }
}