package com.mycompany.main1;


public class Rectangulo {
    int base, altura;
    Double base1, altura1;
    
    public Rectangulo(int base, int altura, Double base1, Double altura1){
        this.base=base;
        this.altura=altura;
        this.base1=base1;
        this.altura1=altura1;
    }
    
    public int calcularArea(int base, int altura){
        return (base*altura);
    }
    public Double calcularArea(Double base1, Double altura1){
        return (base1*altura1);
    }
    public int calcularPerimetro(int base, int altura){
        return (2*(base+altura));
    }
    public Double calcularPerimetro(Double base1, Double altura1){
        return (2*(base1+altura1));
    }
}