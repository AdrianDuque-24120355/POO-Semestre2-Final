package tarea7;

import java.util.ArrayList;


public class Inventario {
    public ArrayList<Producto> Productos =new ArrayList<Producto>();
    
    int aumen, reduc;
    
    public Inventario(int aumen, int reduc){
        this.aumen=aumen;
        this.reduc=reduc;
    }
        
    public void RegistrarProducto(Producto Productos){
        this.Productos.add(Productos);
        System.out.println("Se registró nuevo producto");
    }
    
    public int AumentarStock(int stock, int aumen){
        return (stock+aumen);
        
    }

     public int ReducirStock(int stock, int reduc){
        return (stock-reduc);
        
    }
 
    
    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(ArrayList<Producto> Productos) {
        this.Productos = Productos;
    }

    public int getAumen() {
        return aumen;
    }

    public void setAumen(int aumen) {
        this.aumen = aumen;
    }

    public int getReduc() {
        return reduc;
    }

    public void setReduc(int reduc) {
        this.reduc = reduc;
    }
    
}