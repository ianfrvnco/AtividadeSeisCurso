
package questao5;


public class Main {
    public static void main(String[] args) {

        ContaBancaria CB = new ContaBancaria();
        
        CB.depositar(1000);
        CB.sacar(500);
        CB.mostrarSaldo();
        CB.calcularRendimento();
        
    }

}
