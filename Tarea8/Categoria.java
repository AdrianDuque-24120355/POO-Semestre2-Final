
package com.mycompany.main5;

import java.util.ArrayList;
import java.util.Random;
public class Categoria {
    public int id;
    public String nombre;
    Random random=new Random();
    public ArrayList<Categoria> listaproductos =new ArrayList<Categoria>();
    
    public Categoria(String nombre){
        this.id=this.random.nextInt(1, 10001);
        this.nombre=nombre;
    }
    
    public void RegistrarProductoCategoria(Categoria categoria){
        this.listaproductos.add(categoria);
    }
    
    public void MostrarDatos(){
        System.out.println("\n*** CATEGORÍAS EN EL SISTEMA ***");

      if (this.listaproductos.size() == 0) {
         System.out.println("\nNo existen productos en el sistema");
         return;
      }

      
        for (Categoria categoria : listaproductos){
            System.out.println(categoria.getNombre());
            System.out.println(categoria.getId());
        }
    }
    public void Soporte(){
        for (Categoria categoria : listaproductos){
            System.out.println(categoria.getNombre());
            System.out.println(categoria.getId());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

   
}
