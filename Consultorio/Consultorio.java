package consultorio;

import java.util.Random;


public class Consultorio {
    Random random=new Random();
    public int id;
    public int piso;
    public int numeroConsultorio;

    public Consultorio(int piso, int numeroConsultorio) {
        this.id = this.random.nextInt(1, 1001);
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }
    
    public String MostrarDatos(){
        String datos=String.format("Id: %d, piso: %d, numero de consultorio: %d",
        id, piso, numeroConsultorio);
        return datos;
    }

    public int getId() {
        return id;
    }

    public int getPiso() {
        return piso;
    }

    public int getnumeroConsultorio() {
        return numeroConsultorio;
    }
    
    
}