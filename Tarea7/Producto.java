package tarea7;

public class Producto {
   private String nombre;
   private int stock;
   private Double precio;
    
    public Producto(String nombre, Double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    
    public void Stock (String nombre, Double precio){
        stock=0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public Double getPrecio() {
        return precio;
    }
    
    
    
    
}
