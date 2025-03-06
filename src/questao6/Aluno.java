
package questao6;


public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno() {
        this.nome= "Fulano de tal";
        this.nota1 = 5;
        this.nota2 = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome= nome;
    }

        public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1= nota1;
    }

        public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2= nota2;
    }

    public double calcularMedia(){
   
        media=(nota1+nota2)/2;
        return media;
    }
    
    public void calcularAprovacao(){
        if ((nota1+nota2)/2>=7){
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }
    
    public void mostrarDados (){
        System.out.println("Nome: ");
        System.out.println("Nota 1: ");
        System.out.println("Nota 2: ");
        System.out.println("Media: "+(calcularMedia())+media);
    }
}

