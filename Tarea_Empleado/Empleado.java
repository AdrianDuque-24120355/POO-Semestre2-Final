package com.mycompany.main2;

public class Empleado {
    Double sueldo_base, boni;
    int hrs_ex;
    
    public Empleado(Double sueldo_base, Double boni, int hrs_ex){
        this.sueldo_base=sueldo_base;
        this.boni=boni;
        this.hrs_ex=hrs_ex;
    }
    public Double SueldoFinal(Double sueldo_base){
        return sueldo_base;
    }
    public Double SueldoFinal (Double sueldo_base, Double boni){
        return (sueldo_base + boni);
    }
    public Double SueldoFinal (Double sueldo_base, Double boni, int hrs_ex){
        return (sueldo_base + boni + (hrs_ex * 20));
    }
}