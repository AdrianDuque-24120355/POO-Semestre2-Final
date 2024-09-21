package paciente;

public class Paciente {
    public String id;
    public String nombre;
    public String apellidos;
    public String FechaNacimiento;
    private String telefono;
    public String tipoSangre;
    public char sexo;

    public Paciente(String id, String nombre, String apellidos, String FechaNacimiento, String telefono, String tipoSangre, char sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.FechaNacimiento = FechaNacimiento;
        this.telefono = telefono;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
    }
    
    public String MostrarDatos(){
        String datos=String.format("Id: %s, nombre: %s, apellidos: %s, fecha de nacimiento: %s, telefono: %s, tipo de sangre: %s, sexo: %s",
        id, nombre, apellidos, FechaNacimiento, telefono, tipoSangre, sexo);
        return datos;
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

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }
}