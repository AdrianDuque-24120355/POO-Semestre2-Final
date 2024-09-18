package com.mycompany.main6;

import java.util.Scanner;


public class Main6 {

    public static void main(String[] args) {
        int opcion=0;
        Scanner scanner= new Scanner(System.in);
         while (opcion != 8) {
            System.out.println("\n*** BIENVENIDO ***");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Asignar sala a paciente");
            System.out.println("3. Dar de alta a paciente");
            System.out.println("4. Asignar medico");
            System.out.println("5. Eliminar medico");
            System.out.println("6. Conseguir consulta");
            System.out.println("7. Asignar consultorio");
            System.out.println("8. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    
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
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}