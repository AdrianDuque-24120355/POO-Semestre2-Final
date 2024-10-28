public class EnvioNacional extends Envio{

    private double distanciaKm;

    public EnvioNacional(double costoBase, double peso, double distanciaKm) {
        super(costoBase, peso);
        this.distanciaKm = distanciaKm;
    }

    @Override
    public void calcularTiempoYCostoEntrega(){
        int contdias=1;
        double costo=getCostoBase();
        do{
           distanciaKm = distanciaKm -200;
           contdias++;
        }while (distanciaKm >= 200);
         if (getPeso()>5){
             costo=costo+(getCostoBase()*0.05);
         }

        System.out.println("El número de días que debe esperar por su pédido son: "+contdias);
        System.out.println("El costo de su envío es: $"+costo);
    }
}
