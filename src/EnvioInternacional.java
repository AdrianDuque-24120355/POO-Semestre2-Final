public class EnvioInternacional extends Envio{
    private Nacionalidad nacionalidad;

    public EnvioInternacional(double costoBase, double peso, Nacionalidad nacionalidad) {
        super(costoBase, peso);
        this.nacionalidad = nacionalidad;
    }
    @Override
    public void calcularTiempoYCostoEntrega(){
        int diasEnvio=10;
        double precioTotal=getCostoBase();
        if (getPeso()>10){
            diasEnvio=diasEnvio+3;
        }
        if (nacionalidad==Nacionalidad.INTERNACIONAL){
            precioTotal=precioTotal+(getCostoBase()*0.2);
        }
        System.out.println("Su envío llegará en "+diasEnvio+" días");
        System.out.println("Costo: $"+precioTotal);
    }
}

