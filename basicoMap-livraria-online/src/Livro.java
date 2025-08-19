import java.util.Comparator;

public class Livro implements Comparator<Livro>{
        //atributor
    private String titulo;

    private String autor;

    private double preco;

///////////////////////////////////
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compare(Livro p1, Livro p2) {
        return Double.compare(p1.getPreco(),p2.getPreco());
    }

}
