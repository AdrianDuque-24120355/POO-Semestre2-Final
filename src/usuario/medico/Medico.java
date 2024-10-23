package usuario.medico;

import usuario.Usuario;
import usuario.utils.Rol;
import java.time.LocalDate;

public class Medico extends Usuario {
    private String RFC;


    public Medico(String id, String nombre, String apellidos, String telefono, String RFC, LocalDate AñoNacimiento, String contrasenia, Rol rol) {
        super (id, nombre, apellidos, telefono, AñoNacimiento, contrasenia, Rol.MEDICO);
        this.RFC = RFC;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()+String.format(", RFC: %s", this.RFC);
    }
    public String getRFC(){
        return RFC;
    }
}
