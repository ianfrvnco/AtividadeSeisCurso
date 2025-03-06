
package questao3;

public class Produto {

    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto() {
        this.nome = "Mouse";
        this.quantidade = 250;
        this.preco = 26.99;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionarEstoque(int adicionar){
        quantidade+=adicionar;
        System.out.println("Feito.");
    }
    public void retirarEstoque (int retirar){
        if (retirar<=quantidade){
            quantidade-=retirar;
            System.out.println("Feito.");
        } else {
            System.out.println("Quantidade insuficiente.");
        }
    }

    public void mostrarDados() {
        System.out.println("Produto: "+nome);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Preço: "+preco);
    }
    
    public void calculoEstoqueTotal (){
        System.out.println("O estoque vale: "+(quantidade*preco));
    }
}

