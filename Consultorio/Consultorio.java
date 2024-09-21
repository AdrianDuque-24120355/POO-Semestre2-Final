package consultorio;

public class Consultorio {
    public String id;
    public int piso;
    public int numeroConsultorio;

    public Consultorio(String id, int piso, int numeroConsultorio) {
        this.id = id;
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }
    
    public String MostrarDatos(){
        String datos=String.format("Id: %s, piso: %d, numero de consultorio: %d",
        id, piso, numeroConsultorio);
        return datos;
    }

    public String getId() {
        return id;
    }

    public int getPiso() {
        return piso;
    }

    public int getnumeroConsultorio() {
        return numeroConsultorio;
    }  
}