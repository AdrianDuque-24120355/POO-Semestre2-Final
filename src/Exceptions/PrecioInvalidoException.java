package Exceptions;

public class PrecioInvalidoException extends RuntimeException {
  public PrecioInvalidoException(String mensaje) {
    super("Error: " + mensaje);
  }
}
