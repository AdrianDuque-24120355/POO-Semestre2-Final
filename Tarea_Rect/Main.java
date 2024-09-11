package com.mycompany.main1;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String respuesta="a";
       int base, altura, el;
       Double base1, altura1;
       
        System.out.println("Ingrese base (int): ");
        base=leer.nextInt();
        
        System.out.println("Ingrese altura (int): ");
        altura=leer.nextInt();
        
        System.out.println("Ingrese base (double): ");
        base1=leer.nextDouble();
        
        System.out.println("Ingrese altura (double): ");
        altura1=leer.nextDouble();
        
        Rectangulo datos=new Rectangulo(base, altura, base1, altura1);
        
        System.out.println("Desea conseguir resultados con numero decimal o entero \n 1. Entero \n 2. Decimal");
        el=leer.nextInt();
        if (el==1){
        System.out.println("El area con numeros enteros es: "+datos.calcularArea(base, altura));
        System.out.println("El perimetro con numeros enteros es: "+datos.calcularPerimetro(base, altura));
        }
        else if (el==2){
        System.out.println("El area con numeros enteros es: "+datos.calcularArea(base1, altura1));
        System.out.println("El perimetro con numeros enteros es: "+datos.calcularPerimetro(base1, altura1));
        }
        else {
            System.out.println("ERROR");
        }
    }
}