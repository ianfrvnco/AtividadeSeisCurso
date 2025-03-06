
package questao9;


public class Livro {
    
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginasLidas;

    public Livro (String titulo, String autor, int totalPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginasLidas = paginasLidas;
    }

    public Livro() {
        this.titulo= "Livro Tal";
        this.autor= "Ciclano da Silva";
        this.totalPaginas = 1466;
        this.paginasLidas = 314;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }
    
    public int atualizarPaginasLidas (int ultimaPagina){
        if (ultimaPagina<=totalPaginas){
        paginasLidas=ultimaPagina;
        } else {
            System.out.println("O livro não tem tantas páginas.");
        }
        return paginasLidas;
    }
    
    public void calcularPorcentagem (){
        int porcentagem=paginasLidas*100/totalPaginas;
        System.out.println("Porcentagem do livro lida: "+porcentagem);
    }
    
    public void checarConclusao(){
        if(totalPaginas-paginasLidas==0){
            System.out.println("Livro concluído.");
        } else {
            System.out.println("Tem caminho pela frente.");
        }
    }
}
