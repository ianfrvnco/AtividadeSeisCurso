
package questao7;


public class Carro {
    private String modelo;
    private double consumoKM;

    public Carro(String modelo, double consumoKM) {
        this.modelo = modelo;
        this.consumoKM = consumoKM;
    }

    public Carro() {
        this.modelo= "Carro tal";
        this.consumoKM = 0.4;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoKM() {
        return consumoKM;
    }

    public void setConsumoKM(double consumoKM) {
        this.consumoKM = consumoKM;
    }

    
    public void calcularGasolina(double KM){
   
        KM/=consumoKM;
        System.out.println("A viagem terá um gasto de: "+KM);
    }
    
    public void calcularGasto(double KM, double preco){
        KM/=consumoKM;
        System.out.println("Gasto da viagem: "+KM*preco);
    }
}
