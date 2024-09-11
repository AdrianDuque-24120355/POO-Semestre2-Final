package com.mycompany.main2;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    Double sueldo_base=0.0, boni=0.0;
    int hrs_ex=0, res;
        
    Empleado datos=new Empleado(sueldo_base, boni, hrs_ex);
    
        System.out.println("Ingrese su salario: ");
        sueldo_base=leer.nextDouble();
        System.out.println("Desearía añadir una bonificación? \n 1.Si \n 2.No");
        res=leer.nextInt();
        
        if (res==1){
            System.out.println("Ingrese bonificación: ");
            boni=leer.nextDouble();
            System.out.println("Trabajo horas extra? \n 1.Si \n 2.No");
            res=leer.nextInt();
            if(res==1){
            System.out.println("Cuantas horas extra trabajo? ");
            hrs_ex=leer.nextInt();
            System.out.println("Su salario final es: $"+datos.SueldoFinal(sueldo_base, boni, hrs_ex));
        }
            else if (res==2) {
            System.out.println("Su salario final es: $"+datos.SueldoFinal(sueldo_base, boni));
        }
            else {
            System.out.println("ERROR");
        }
        }
        else if (res==2){
            System.out.println("Su salario final es: $"+datos.SueldoFinal(sueldo_base));
        }
        else {
            System.out.println("ERROR");
        }
    }
}
