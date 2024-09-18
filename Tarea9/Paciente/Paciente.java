package paciente;


public class Paciente {
    public int id;
    public String nombre;
    public String apellidos;
    public String FechaNacimiento;
    private String telefono;
    public String tipoSangre;
    public char sexo;

    public Paciente(int id, String nombre, String apellidos, String FechaNacimiento, String telefono, String tipoSangre, char sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.FechaNacimiento = FechaNacimiento;
        this.telefono = telefono;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
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