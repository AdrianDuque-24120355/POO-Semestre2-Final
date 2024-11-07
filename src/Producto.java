import Exceptions.CantidadInvalidaException;
import Exceptions.PrecioInvalidoException;
import Exceptions.ProductoInvalidoException;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto {
    Scanner read=new Scanner(System.in);
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public double calcularValorTotal(){
        double valorTotal=getPrecio()*getCantidad();
        return valorTotal;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarDetalles() {
        String info = String.format("Nombre: %s, Precio: %.2f, Cantidad: %d, Valor Total: %.2f", getNombre(), getPrecio(), getCantidad(), calcularValorTotal());
        return info;

    }
}

