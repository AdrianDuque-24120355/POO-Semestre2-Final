package usuario.paciente;

import usuario.Usuario;
import usuario.utils.Rol;
import java.time.LocalDate;
import java.util.ArrayList;

import expediente.Expediente;

public class Paciente extends Usuario{
    public ArrayList<Expediente> listaExpedientes=new ArrayList<>();
    public String tipoSangre;
    public char sexo;
    public Expediente expediente;

    public Paciente(String id, String nombre, String apellidos, LocalDate AñoNacimiento, String telefono, String tipoSangre, char sexo, String contrasenia, Rol rol) {
        super (id, nombre, apellidos, telefono, AñoNacimiento, contrasenia, Rol.PACIENTE);
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
    }

    public String MostrarDatos(){
        String datos=String.format("Id: %s, nombre: %s, apellidos: %s, fecha de nacimiento: %s, telefono: %s, tipo de sangre: %s, sexo: %s, contraseña: %s",
                id, nombre, apellidos, AñoNacimiento, telefono, tipoSangre, sexo, contrasenia);
        return datos;
    }
    public void registrarExpediente(Expediente expediente){
        this.listaExpedientes.add(expediente);
    }
    public String getTipoSangre() {
        return tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }
}
