package expediente;

import consulta.Consulta;
import java.time.LocalDateTime;
import java.util.Random;
import java.time.LocalDate;

public class Expediente{
    public String ID;
    public Consulta consulta;
    public String observaciones;
    public LocalDateTime fechaExpediente;

    public Expediente(Consulta consulta, String observaciones){
        this.ID=this.generarId();
        this.consulta=consulta;
        this.observaciones=observaciones;
        this.fechaExpediente=LocalDateTime.now();

    }
    public String generarId(){
        Random random=new Random();
        LocalDate fecha= LocalDate.now();

        int añoactual=fecha.getYear();
        int mesactual=fecha.getMonthValue();
        int numeroAleatorio= random.nextInt(1,100000);

                String id=String.format("E%d%d%d",añoactual, mesactual, numeroAleatorio);
                return id;
    }

}