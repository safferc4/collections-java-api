public class Item {
    @Override
    public String toString() {
        return "[ "+"Item  | Nome do item : " + nome + "| Preço do item: R$" + preco + "| Quantidade do item no estoque: " + quantidade + " ]";
    }

    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


}
