package questao4;

public class Calculadora {

    private double numero;

    public Calculadora(double numero) {
        this.numero = numero;
    }

    public Calculadora() {
        this.numero = 8;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public void calcular(double valor) {

        double soma = numero+valor;
        double subtracao = numero-valor;
        System.out.println(numero + " + " + valor + " = " + soma);
        System.out.println(numero + " - " + valor + " = " + subtracao);
        System.out.println(numero + " multiplicado por " + valor + " = " + numero * valor);
        if (valor > 0) {
            System.out.println(numero + " dividido por " + valor + " = " + numero / valor);
        } else {
            System.out.println("Impossível dividir por esse valor.");
        }
    }

    public void raizQuadrada() {
        this.numero = Math.sqrt(numero);
        System.out.println(numero);
    }

    public void potencia(int expoente) {
        numero = Math.pow(numero, expoente);
        System.out.println(numero);
    }

    public void fatorial() {
        for (int f = 1; f < numero; f++) {
            System.out.println(f * numero + "\n");
        }
    }
}