package Usuario.medico;

import Usuario.Usuario;
import Usuario.utils.Rol;
import java.time.LocalDate;

public class Medico extends Usuario {
    private String RFC;
   
    
    public Medico(String id, String nombre, String apellidos, String telefono, String RFC, LocalDate AñoNacimiento, String contrasenia) {
        super (id, nombre, apellidos, telefono, AñoNacimiento, contrasenia, Rol.MEDICO);
        this.RFC = RFC;
    }
    
     public String MostrarDatos(){
        String datos=String.format("Id: %s, nombre: %s, apellidos: %s, telefono: %s, RFC: %s, Año Nacimiento: %s",
        id, nombre, apellidos, telefono, RFC, AñoNacimiento);
        return datos;
    }    
   public String getRFC(){
       return RFC;
   } 
}
