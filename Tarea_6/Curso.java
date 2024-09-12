package com.mycompany.main4;


public class Curso1 {
     String nom_cur, cod_cur, instruct;
    
    public Curso1 (String nom_cur, String cod_cur, String instruct){
        this.nom_cur=nom_cur;
        this.cod_cur=cod_cur;
        this.instruct=instruct;
        
    }
    public void mostrarInfoCurso(){
        System.out.println("Nombre del curso: "+nom_cur);
        System.out.println("Codigo del curso: "+cod_cur);
        System.out.println("Nombre del instructor: "+instruct);
    }
}