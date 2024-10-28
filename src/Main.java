public class Main {
    public static void main(String[] args) {
      Envio envioNacional=new EnvioNacional(560, 6, 1200);
      envioNacional.validarPeso();
      envioNacional.calcularTiempoYCostoEntrega();

        System.out.println("******");

      Envio envioInternacional= new EnvioInternacional(500, 12, Nacionalidad.INTERNACIONAL);
      envioInternacional.validarPeso();
      envioInternacional.calcularTiempoYCostoEntrega();
    }
}