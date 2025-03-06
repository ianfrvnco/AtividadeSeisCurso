
package questao5;


public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular= titular;
        this.saldo = saldo;
    }

    public ContaBancaria() {
        this.titular= "Fulano de tal";
        this.saldo = 1500;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    

    public void depositar(double valor){
   
        saldo+=valor;
        System.out.println("Feito.");
    }
    
    public void sacar(double valor) {
        if(valor<=saldo){
            saldo-=valor;
        }
    }

    public void mostrarSaldo() {
        System.out.println(saldo);
    }

    
    public void calcularRendimento(){
        System.out.println("O saldo atual irá render "+saldo*0.005+" este mês.");
    }
}
