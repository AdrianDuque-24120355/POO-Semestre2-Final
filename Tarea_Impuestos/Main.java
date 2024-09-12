package com.mycompany.main3;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
    Double porcentajeImp=0.0, dividendos=0.0, exencion=0.0;
    int ingresos=0, res;
        
        System.out.println("Desearia añadir ingresos? \n 1. Si \n 2. No");
        res=leer.nextInt();
        CalculadoraImpuestos datos= new CalculadoraImpuestos(porcentajeImp, dividendos, exencion, ingresos);
       if (res==1){ //Empieza res =1 de Ingresos
            System.out.println("Añada sus ingresos(ventas): ");
            ingresos=leer.nextInt();
            System.out.println("Desearia añadir su porcentaje de impuestos? \n 1. Si \n 2. No");
            res=leer.nextInt();
            if (res==1){ //Empieza res = 1 de Impuestos
              System.out.println("Ingrese su porcentaje de impuestos: ");
              porcentajeImp=leer.nextDouble();
              System.out.println("Desearia añadir sus dividendos? \n 1. Si \n 2. No");
              res=leer.nextInt();
              if (res==1){ //Empieza res = 1 de Dividendos
                  System.out.println("Ingrese sus dividendos: ");
              dividendos=leer.nextDouble();
              System.out.println("Desearia añadir su exencion? \n 1. Si \n 2. No");
              res=leer.nextInt();
              if (res==1){//Empieza res = 1 de exencion
              System.out.println("Ingrese su exencion: ");
              exencion=leer.nextDouble();
              System.out.println("Los ingresos finales son: "+datos.IngresoFinale(dividendos, porcentajeImp, exencion));
              }
              else if (res==2){ // Empieza res=2 de exencion
              System.out.println("Los ingresos finales son: "+datos.IngresoFinale(ingresos, porcentajeImp));
              }
              }
              else if (res==2){ //Empieza res = 2 de Dividendos
                  System.out.println("Los ingresos finales son: "+datos.IngresoFinale(ingresos, porcentajeImp));
              }
            }
            else if (res==2){ //Empieza res = 2 de Dividendos
                System.out.println("Los ingresos finales son: $"+datos.IngresoFinale(ingresos));
            }
        }
        else if (res==2){ //Empieza res = 2 de Ingresos
            System.out.println("Desearia añadir sus dividendos? \n 1. Si \n 2. No");
            res=leer.nextInt();
            if (res==1){//Empieza dividendos r=1
              System.out.println("Ingrese sus dividendos: ");
              dividendos=leer.nextDouble();
              System.out.println("Desearia añadir su porcentaje de impuestos? \n 1. Si \n 2. No");
              res=leer.nextInt();
              if (res==1){//Empieza impuestos r=1
                System.out.println("Ingrese su porcentaje de impuestos: ");
                porcentajeImp=leer.nextDouble();
                System.out.println("Desearia añadir su exencion? \n 1. Si \n 2. No");
                res=leer.nextInt();
               if (res==1){
                System.out.println("Ingrese su exencion: ");
                exencion=leer.nextDouble();
                System.out.println("Los ingresos finales son: "+datos.IngresoFinale(dividendos, porcentajeImp, exencion));
               }
               else if (res==2){
                   
               }
              }
              else if (res==2){ //empieza impuestos r=2
                  
              }
            }
            else if (res==2){ //empieza dividendos r=2
                
            }
        }
    }
}