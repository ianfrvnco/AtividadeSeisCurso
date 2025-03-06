package questao8;

public class Funcionario {

    private String nome;
    private double salario;
    private double salarioAjustado= 0;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
        this.nome= "Ciclano da Silva";
        this.salario = 1.466;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public void reajustarSalario (double reajuste){
   
        salarioAjustado=(salario*reajuste)+salario;
        System.out.println("Novo salario: "+salarioAjustado);
    }
    
    public void mostrarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
    }
    
    public void calcularSalarioAnual(){
        System.out.println("Valor anual com reajuste: "+salarioAjustado*12);
    }
    
    
}

