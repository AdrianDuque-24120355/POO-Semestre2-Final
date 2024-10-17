package Usuario.admin;

import Usuario.Usuario;
import Usuario.utils.Rol;
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
