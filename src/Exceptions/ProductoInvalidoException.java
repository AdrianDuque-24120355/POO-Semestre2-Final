package Exceptions;

public class ProductoInvalidoException extends Exception {

  public static final long serialVersionUID = 700L;

  public ProductoInvalidoException(String mensaje) {
    super(mensaje);
  }
}

