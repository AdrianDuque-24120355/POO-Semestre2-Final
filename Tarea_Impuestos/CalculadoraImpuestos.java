package com.mycompany.main3;

public class CalculadoraImpuestos {
    Double porcentajeImp, dividendos, exencion, imp=0.0;
    int ingresos;
    
    public CalculadoraImpuestos(Double porcentajeImp, Double dividendos, Double exencion, int ingresos){
        this.porcentajeImp=porcentajeImp;
        this.dividendos=dividendos;
        this.exencion=exencion;
        this.ingresos=ingresos;
    }
    public Double IngresoFinale(int ingresos){
        return (ingresos+0.15);
    }
    public Double IngresoFinale (int ingresos, Double porcentajeImp){
        return (ingresos*(porcentajeImp/100));
    }
    public Double IngresoFinale (Double dividendos, Double porcentajeImp, Double exencion){
       imp=dividendos*(porcentajeImp/100);
       if (imp>exencion){
           return (imp-exencion);
       }
       else{
           return 0.0;
       }
    }
}