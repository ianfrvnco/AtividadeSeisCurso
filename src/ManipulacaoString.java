
public class ManipulacaoString {

    private String palavra;

    public ManipulacaoString(String palavra) {
        this.palavra = palavra;
    }

    public ManipulacaoString() {
        this.palavra = "Sem texto";
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int contarCaracteres() {
        return this.palavra.length();
    }

    public void verificarParImpar() {
        int quant = 0;
        quant = this.palavra.length();
        quant %= 2;
        if (quant == 0) {
            System.out.println("É par.");
        } else {
            System.out.println("É ímpar.");
        }
    }

    public void inverterString() {
        String reverse = new StringBuffer(this.palavra).reverse().toString();
        System.out.println(reverse);
    }
}
