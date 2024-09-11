package com.mycompany.main;


public class Coche {
     String marca, modelo;
    int año, fec=0, añoActual=2024;
    
    public Coche(String marca, String modelo, int año){
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
    }
    
    public void mostrarInformacion(){
        System.out.println("La marca es: "+marca);
        System.out.println("El modelo es: "+modelo);
        System.out.println("Su fecha de salida fue: "+año);
        
    }
    public void calcularEdadDelCoche(){
        fec=añoActual-año;
        System.out.println("El automovil fue lanzado hace "+fec+" anos");
    }
}