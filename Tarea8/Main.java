package com.mycompany.main5;

import java.util.Scanner;


public class Main5{

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        Categoria categoria= new Categoria("");

        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n*** BIENVENIDO ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Registrar categoría");
            System.out.println("5. Mostrar categoría");
            System.out.println("6. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (categoria.listaproductos.size()==0){
                        System.out.println("No hay categorías");
                        break;
                    }
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.println("Ingresa el nombre del producto");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el precio del producto");
                    double precio = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.println("Ingresa la descripción del producto");
                    String descripcion = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa la categoría del producto");
                    int IDCategoria = scanner.nextInt();

                    scanner.nextLine();
                   
                   categoria.Soporte();
                   boolean existe= categoria.listaproductos.contains(IDCategoria);
                 if (existe==false){
                     while (categoria.listaproductos.contains(IDCategoria)==false){
                    System.out.println("Ingresa la categoría del producto");
                    IDCategoria = scanner.nextInt();

                    scanner.nextLine();  
                 }
                 }
                 else{
                     
                 

                    System.out.println("Ingresa el stock del producto");
                    int stock = scanner.nextInt();

                    System.out.println(nombre);

                    Producto producto = new Producto(nombre, precio, descripcion, IDCategoria, stock);
                    inventario.registrarProducto(producto);

                    System.out.println("\nProducto registrado correctamente");
                    break;}
                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.println("Ingresa el ID del producto: ");
                    int id = scanner.nextInt();

                    inventario.eliminarProducto(id);
                    break;
                case 3:
                    inventario.mostrarProductos();
                    break;
                case 4:
                    System.out.println("Ingresa el nombre del producto");
                    nombre = scanner.nextLine();
                   
                    scanner.nextLine();
                    categoria.setNombre(nombre);
                    categoria.getId();
                    categoria.RegistrarProductoCategoria(categoria);
                    break;
                case 5:
                    categoria.MostrarDatos();
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}
