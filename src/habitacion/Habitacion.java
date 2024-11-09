package habitacion;

import java.util.ArrayList;

public class Habitacion {

    public ArrayList<Habitacion> listaHabitaciones=new ArrayList<>();
    String tipoHabitacion;
    Double precioPorNoche;
    Boolean disponibilidad;


    public Habitacion(String tipoHabitacion, Double precioPorNoche, Boolean disponibilidad) {
        this.tipoHabitacion = tipoHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.disponibilidad = disponibilidad;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public Double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setPrecioPorNoche(Double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }


    public void reservar(int noches){

    }

    public boolean liberar(){
        return false;
    }

    public String mostrarDetalles(){
        String info=String.format("Tipo de habitación: %s, Precio por noche: %.2f, Disponibilidad: %s"
                , tipoHabitacion, precioPorNoche, disponibilidad);
        return info;
    }
}

