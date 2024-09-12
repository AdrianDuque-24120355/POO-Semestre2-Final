package com.mycompany.main4;

public class Main4 {

    public static void main(String[] args) {
     Estudiante estudiante = new Estudiante("Jose", "25120342");
     Estudiante estudiante2 = new Estudiante ("Kimberly", "23560201");
     Curso1 curso1 =new Curso1("Matematicas", "56117", "Benjamin Aburto Torres");
     Curso1 curso2 =new Curso1("Ingles", "58556", "Nayeli Hernandez Chavez");
     Curso1 curso3 =new Curso1("Quimica", "34567", "Rosa del Campo Grande");
     Curso1 curso4 =new Curso1("Programacion Orientada a Objetos", "65412", "Eder Rivera Cisneros");
        
     estudiante.agregarCurso(curso1);
     estudiante.agregarCurso(curso3);
     
     estudiante2.agregarCurso(curso2);
     estudiante2.agregarCurso(curso4);
     
     estudiante.mostrarInfo();
     estudiante2.mostrarInfo();
    }
}
