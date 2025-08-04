
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra{
    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));

    }

      public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();
    if (!itemList.isEmpty()) {
      for (Item i : itemList) {
        if (i.getNome().equalsIgnoreCase(nome)) {
          itensParaRemover.add(i);
        }
      }
      itemList.removeAll(itensParaRemover);
    } else {
      System.out.println("A lista está vazia!");
    }
  }


     public double calcularValorTotal() {
    double valorTotal = 0d;
    if (!itemList.isEmpty()) {
      for (Item item : itemList) {
        double valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public void exibirItens(){
    System.out.println(itemList);
  }
    public static void main(String[] args) {
      CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

      carrinho.adicionarItem("Arroz", 5.0, 2);

      System.out.println("Itens no carrinho:");
    for (Item item : carrinho.itemList) {
        System.out.println(item.getNome());
}
      System.out.println("Valor total: R$ " + carrinho.calcularValorTotal());

      System.out.println("Itens no carrinho após remoção: ");
      for (Item item : carrinho.itemList) {
        System.out.println(item.getNome());
      }

        CarrinhoDeCompra carrinho2 = new CarrinhoDeCompra();

      // Adicionando um item
      carrinho.adicionarItem("Feijão", 8.0, 4);

      System.out.println("Itens no carrinho:");
    for (Item item : carrinho.itemList) {
        System.out.println(item.getNome());
        }


    System.out.println("Informações dos itens: ");
    carrinho.exibirItens();
    }
}
