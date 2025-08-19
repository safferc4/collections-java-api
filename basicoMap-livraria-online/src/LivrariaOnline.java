import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> livrariaOnlineMap;

    public LivrariaOnline() {
        this.livrariaOnlineMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrariaOnlineMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if (!livrariaOnlineMap.isEmpty()) {
            livrariaOnlineMap.remove(titulo);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> livrosPorPreco = new TreeMap<>(livrariaOnlineMap);
        System.out.println(livrosPorPreco);
        return livrosPorPreco;
    }

    public Livro pesquisarLivrosPorAutor(String autor){
        Livro livroPorAutor = null;
        if (!livrariaOnlineMap.isEmpty()){
            for (Livro a : livrariaOnlineMap.values()){
                if (a.getAutor().equalsIgnoreCase(autor)){
                    System.out.println(a);
                    livroPorAutor = a;
                }
            }
        }
        return livroPorAutor;
    }

    public Livro obterLivroMaisCaro(){
    Livro livroMaisCaro = null;
    Double maiorPreco = Double.MIN_VALUE;
        if (!livrariaOnlineMap.isEmpty()){
            for (Livro l : livrariaOnlineMap.values()){
                if (l.getPreco() > maiorPreco){
                    livroMaisCaro = l;
                    System.out.println(livroMaisCaro);
                }
            }
        }
        return livroMaisCaro;
    }

        public Livro obterLivroMaisBarato(){
    Livro livroMaisBarato = null;
    Double menorPreco = Double.MAX_VALUE;
        if (!livrariaOnlineMap.isEmpty()){
            for (Livro l : livrariaOnlineMap.values()){
                if (l.getPreco() < menorPreco){
                    livroMaisBarato = l;
                    System.out.println(livroMaisBarato);
                }
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

    }
}
