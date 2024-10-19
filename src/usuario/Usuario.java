package usuario;

import java.time.LocalDate;
import usuario.utils.Rol;


public class Usuario {
    public String id;
    public String nombre;
    public String apellidos;
    public String telefono;
    public LocalDate AñoNacimiento;
    public String contrasenia;
    public Rol rol;

    public Usuario(String id, String nombre, String apellidos, String telefono, LocalDate AñoNacimiento, String contrasenia, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.AñoNacimiento = AñoNacimiento;
        this.contrasenia=contrasenia;
        this.rol=rol;
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
    public String getContrasenia(){
        return contrasenia;
    }
    public Rol getRol(){
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
