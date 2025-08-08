import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numberlist;

    public OrdenacaoNumeros(){
        this.numberlist = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numberlist.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(numberlist);
        System.out.println("A lista ordenada em ordem ascendente: "+ numberlist);
    }


    public void ordenarDescendente(){
        Collections.sort(numberlist.reversed());
        System.out.println("A lista ordenada em ordem descendente: "+ numberlist);
    }
    public static void main(String[] args) {
        OrdenacaoNumeros lista = new OrdenacaoNumeros();


        lista.adicionarNumero(35);
        lista.adicionarNumero(41);
        lista.adicionarNumero(95);
        lista.adicionarNumero(34);
        lista.adicionarNumero(7);
        lista.adicionarNumero(54);
        lista.adicionarNumero(37);
        lista.adicionarNumero(1);
        lista.adicionarNumero(24);
        lista.adicionarNumero(84);
        lista.adicionarNumero(7);
        lista.adicionarNumero(38);
        lista.adicionarNumero(55);
        lista.adicionarNumero(67);
        lista.adicionarNumero(65);
        lista.adicionarNumero(43);
        lista.adicionarNumero(92);
        lista.adicionarNumero(52);
        lista.adicionarNumero(6);
        lista.adicionarNumero(75);
        lista.adicionarNumero(41);


        lista.ordenarAscendente();

        lista.ordenarDescendente();

    }



}
