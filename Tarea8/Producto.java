package com.mycompany.main5;

import java.util.Random;


public class Producto {
    public int id;
    public String nombre;
    public Double precio;
    public String descripcion;
    public int IDCategoria;
    public int stock;
    public Random random = new Random();

    public Producto(String nombre, Double precio, String descripcion, int IDCategoria, int stock) {
        this.id = this.random.nextInt(1, 10001);
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.IDCategoria = IDCategoria;
        this.stock = stock;
    }
    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIDCategoria() {
        return IDCategoria;
    }

    public int getStock() {
        return stock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIDCategoria(int IDCategoria) {
        this.IDCategoria = IDCategoria;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
    

    public String mostrarProducto() {
        return String.format("Id: %d, nombre: %s, precio: %.2f, descripción: %s, categoría: %s, stock: %d",
                id,
                nombre,
                precio,
                descripcion,
                IDCategoria,
                stock
        );
    }
}