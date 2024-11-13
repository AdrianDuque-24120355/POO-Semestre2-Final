import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int opcion=0;
        while(opcion!=3){
            System.out.println("1. Escribir tarea");
            System.out.println("2. Leer tareas");
            System.out.println("3. Terminar");
            System.out.println("Selecciona una opcion: ");
            opcion=read.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese la tarea: ");
                    read.nextLine();
                    String tarea=read.nextLine();
                    try(FileWriter a3=new FileWriter("Cuadro1.txt", true);
                        BufferedWriter otro=new BufferedWriter(a3);){
                        otro.write("\n"+tarea);
                    }catch(IOException e){
                        System.out.println("Error al sobreescribir el archivo"+e.getMessage());
                    }
                    System.out.println("Tarea guardada");
                    break;
                case 2:
                    System.out.println("***Tareas guardadas***");
                    try (FileReader a4=new FileReader(("Cuadro1.txt"));){
                        BufferedReader otro2=new BufferedReader(a4);
                        String linea;
                        while((linea= otro2.readLine())!= null){
                            System.out.println(linea);
                        }
                    }catch(IOException e){
                        System.out.println("Error al leer el archivo" + e);
                    }
                    break;
                case 3:
                    System.out.println("Usted salió del programa");
                    break;
                default:
                    System.out.println("Esa opción no existe");
            }
        }
    }
}