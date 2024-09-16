package tarea7;

import java.util.Scanner;


public class Tarea7 {


    public static void main(String[] args) {
     Scanner read=new Scanner(System.in);
     Inventario inventario= new Inventario(0, 0);
     Producto producto=new Producto("",0.0,0);
     
     int opcion=0;
         
                System.out.println("Crea un producto nuevo");
            
                System.out.println("Ingresa el nombre del producto");
                String nombre=read.nextLine();
                
                if (nombre==" "){
                    do{
                    System.out.println("Ingrese un nombre al producto");
                    nombre=read.nextLine();
                    producto.setNombre(nombre);
                    }while (nombre==" "); 
                }
                
                System.out.println("Ingresa el precio del producto");
                Double precio=read.nextDouble();
                if (precio<=0){
                    do{
                    System.out.println("Ingrese valor positivo de precio");
                    precio=read.nextDouble();
                    producto.setPrecio(precio);
                    }while (precio<=0); 
                }
                
                System.out.println("Ingresa el numero de stock");
                int stock=read.nextInt();
                 if (stock<=0){
                    do{
                    System.out.println("Ingrese valor positivo de stock");
                    stock=read.nextInt();
                    producto.setStock(stock);
                    }while (stock<=0); 
                }
                
               
                inventario.RegistrarProducto(producto);
               
                
         while (opcion !=3){
           System.out.println("*** BIENVENIDO ***");
           System.out.println("1. Aumentar Stock");
           System.out.println("2. Reducir Stock");
           System.out.println("3. Salir");
         
         System.out.println("Selecciona una opción: ");
         opcion=read.nextInt();
         
                
        switch (opcion){
            case 1: 
                System.out.println("Seleccionaste la opción de aumentar Stock");
                System.out.println("Ingresa el valor que desea aumentar al Stock");
                int aumen=read.nextInt();
                inventario.setAumen(aumen);
                System.out.println("Su stock actual es: "+inventario.AumentarStock(stock, aumen));
                break;
                
            case 2:
                System.out.println("Seleccionaste la opción de reducir Stock");
                System.out.println("Ingresa el valor que desea reducir al Stock");
                int reduc=read.nextInt();
                inventario.setAumen(reduc);
                System.out.println("Su stock actual es: "+inventario.ReducirStock(stock, reduc));
                break;
                }
            
               
                }
         
         System.out.println("Hasta luego");
         }
         
         
     }
    