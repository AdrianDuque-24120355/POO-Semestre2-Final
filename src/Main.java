import Exceptions.CantidadInvalidaException;
import Exceptions.PrecioInvalidoException;
import Exceptions.ProductoInvalidoException;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ProductoInvalidoException, PrecioInvalidoException, CantidadInvalidaException {
        Scanner read = new Scanner(System.in);
        Helper helper = new Helper();

        boolean opcion = true;
        String producto = "";
        double precio = 0;
        int cantidad = 0;


            while (!helper.ProductoInvalidoException()) {
                try {
                    helper.ProductoInvalidoException();
                } catch (ProductoInvalidoException e) {
                    System.out.println("No se pudo aceptar el producto debido a: " + e.getMessage());
                }
            }
            while (!helper.PrecioInvalidoException()) {
                try {
                    helper.PrecioInvalidoException();
                } catch (PrecioInvalidoException e) {
                    System.out.println("No se pudo aceptar el precio debido a: " + e.getMessage());
                }
            }
            while (!helper.CantidadInvalidoException()) {
                try {
                    helper.CantidadInvalidoException();
                } catch (CantidadInvalidaException e) {
                    System.out.println("No se pudo aceptar la cantidad debido a: " + e.getMessage());
                }
            }
            System.out.println(helper.mostrarDetalles());
        }

    }
