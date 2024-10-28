public abstract class Envio {

    private double costoBase;
    private double peso;

    public Envio(double costoBase, double peso) {
        this.costoBase = costoBase;
        this.peso = peso;
    }

    public abstract void calcularTiempoYCostoEntrega();

    public void validarPeso(){
        if (peso <=0){
            System.out.println("Peso inválido");
        }
        else{
            System.out.println("Peso válido");
        }
    }

    public double getCostoBase() {
        return costoBase;
    }

    public double getPeso() {
        return peso;
    }
}
