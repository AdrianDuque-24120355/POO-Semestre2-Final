package medico;

import java.util.Random;


public class Medico {
    Random random=new Random();
    public int id;
    public String nombre;
    public String apellidos;
    private String telefono;
    private String RFC;
    
    public Medico(String nombre, String apellidos, String telefono, String RFC) {
        this.id = this.random.nextInt(1, 1001);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.RFC = RFC;
    }
    
     public String MostrarDatos(){
        String datos=String.format("Id: %d, nombre: %s, apellidos: %s, telefono: %s, RFC: %s",
        id, nombre, apellidos, telefono, RFC);
        return datos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }
 
    
}