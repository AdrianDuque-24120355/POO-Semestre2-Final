package com.mycompany.main4;
import java.util.ArrayList;

public class Estudiante {
    String nombre, ID;
    public ArrayList<Curso1> Cursos =new ArrayList<Curso1>();
            
        public Estudiante (String nombre, String ID){
            this.nombre=nombre;
            this.ID=ID;
        }
        
        public void agregarCurso(Curso1 Cursos){
            this.Cursos.add(Cursos);
            System.out.println("Se registro nuevo curso");
        }
        
        public void mostrarInfo(){
            System.out.println("\n*** ALUMNO ***");
            System.out.println("Nombre alumno: "+this.nombre);
            System.out.println("ID : "+this.ID);
            System.out.println("\n*** CARGA ACADEMICA ***");
            
            for (Curso1 curso : this.Cursos){
                System.out.println("\nNombre curso: "+curso.nom_cur);
                System.out.println("Codigo curso: "+curso.cod_cur);
                System.out.println("Instructor: "+curso.instruct);
                
            }
        }
}