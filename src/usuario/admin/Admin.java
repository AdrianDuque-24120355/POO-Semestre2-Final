package usuario.admin;

import usuario.Usuario;
import usuario.utils.Rol;
import java.time.LocalDate;

public class Admin extends Usuario {
    private int sueldo, AniosTrabajados;
    private String RFC;

    public Admin(int sueldo, int AniosTrabajados, String RFC, String id, String nombre, String apellidos, String telefono, LocalDate AñoNacimiento, String contrasenia) {
        super(id, nombre, apellidos, telefono, AñoNacimiento, contrasenia, Rol.ADMIN);
        this.sueldo = sueldo;
        this.AniosTrabajados = AniosTrabajados;
        this.RFC = RFC;
    }
    public String MostrarDatos(){
        String datos=String.format("Id: %s, nombre: %s, apellidos: %s, telefono: %s, RFC: %s, Año Nacimiento: %s, Contraseña: %s, Sueldo: %d, Años Trabajados: %d",
                id, nombre, apellidos, telefono, RFC, AñoNacimiento, contrasenia, sueldo, AniosTrabajados);
        return datos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public int getAniosTrabajados() {
        return AniosTrabajados;
    }

    public String getRFC() {
        return RFC;
    }


}
