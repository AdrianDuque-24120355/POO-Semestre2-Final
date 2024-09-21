package medico;

import java.util.Random;


public class Medico {
    Random random=new Random();
    public String id;
    public String nombre;
    public String apellidos;
    private String telefono;
    private String RFC;
    private int AñoNacimiento;
    
    public Medico(String id, String nombre, String apellidos, String telefono, String RFC, int AñoNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.RFC = RFC;
        this.AñoNacimiento = AñoNacimiento;
    }
    
     public String MostrarDatos(){
        String datos=String.format("Id: %s, nombre: %s, apellidos: %s, telefono: %s, RFC: %s, Año Nacimiento: %d",
        id, nombre, apellidos, telefono, RFC, AñoNacimiento);
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
    public String getPrimerasDosLetras(){
        return apellidos.length()>=2 ? apellidos.substring(0, 2): apellidos;
    }
    public int getultimoDigitoAñoNacimiento(){
        return this.AñoNacimiento %10;
    }

    public String getTelefono() {
        return telefono;
    }
}