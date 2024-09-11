package com.mycompany.main;


public class Main {

    public static void main(String[] args) {
       System.out.println("Coche Uno.");
       Coche c1= new Coche("Chevrolet", "Aveo", 2010);
       c1.mostrarInformacion();
       c1.calcularEdadDelCoche();
        
       System.out.println("\nCoche Dos.");
       Coche c2= new Coche("Ford", "Bronco", 1990);
       c2.mostrarInformacion();
       c2.calcularEdadDelCoche();
        
       System.out.println("\nCoche Tres.");
       Coche c3= new Coche("Suzuki", "Swift GLX TM", 2014);
       c3.mostrarInformacion();
       c3.calcularEdadDelCoche();
    }
}