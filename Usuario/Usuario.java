package Usuario;

import java.time.LocalDate;
import Usuario.utils.Rol;

public class Usuario {
    public String id;
    public String nombre;
    public String apellidos;
    public String telefono;
    public LocalDate AñoNacimiento;
    public String contrasenia;

    public Usuario(String id, String nombre, String apellidos, String telefono, LocalDate AñoNacimiento, String contrasenia, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.AñoNacimiento = AñoNacimiento;
        this.contrasenia=contrasenia;
    }

    public String getId() {
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

    public LocalDate getAñoNacimiento() {
        return AñoNacimiento;
    }
    protected String getContrasenia(){
        return contrasenia;
    }    
}