import Exceptions.CantidadInvalidaException;
import Exceptions.PrecioInvalidoException;
import Exceptions.ProductoInvalidoException;


import java.util.Scanner;

public class Helper {
    Scanner read = new Scanner(System.in);
    Producto producto1 = new Producto("", 0, 0);


    public boolean ProductoInvalidoException() throws ProductoInvalidoException {
        System.out.println("Ingrese el nombre del producto: ");
        String producto = read.nextLine();
        producto1.setNombre(producto);
        if (producto == "" || producto == null) {
            throw new ProductoInvalidoException("Que no tiene asignado un nombre el producto");
        }
        return true;
    }

    public boolean CantidadInvalidoException() throws CantidadInvalidaException {
        System.out.println("Ingrese la cantidad del producto: ");
        int cantidad = read.nextInt();
        producto1.setCantidad(cantidad);
        if (cantidad < 0) {
            throw new CantidadInvalidaException("Que la cantidad de un producto debe ser mayor a 0");
        }
        return true;
    }

    public boolean PrecioInvalidoException() throws PrecioInvalidoException {
        System.out.println("Ingrese el precio del producto: ");
        double precio = read.nextDouble();
        producto1.setPrecio(precio);
        if (precio <= 0) {
            throw new PrecioInvalidoException("Que el precio debe ser mayor a 0");
        }
        return true;
    }

    public double valorTotal() {
        double valorTotal = producto1.getPrecio() * producto1.getCantidad();
        return valorTotal;
    }

    public String mostrarDetalles() {
        String info = String.format("Nombre: %s, Precio: %.2f, Cantidad: %d, Valor Total: %.2f", producto1.getNombre(), producto1.getPrecio(), producto1.getCantidad(), valorTotal());
        return info;
    }
}
