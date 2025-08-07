import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> numberList;

    public SomaNumeros() {
        this.numberList = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero){
        numberList.add(numero);
    }

    public void calcularSoma(){
        int soma = 0;

        for(int numero : numberList){
            soma += numero;
        }
        System.out.println("O valor da soma é: "+ soma);
    }

    public void encontrarMaiorNumero(){
        int maior = numberList.get(0);
        for (int i = 1; i < numberList.size(); i++) {
    int numeroAtual = numberList.get(i);  
    if (numeroAtual > maior) {
    maior = numeroAtual;
    }
}
    System.out.println("O maior número da lista é: " + maior);   
    }

    public void encontrarMenorNumero(){
        int menor = numberList.get(0);
    for (int i = 1; i < numberList.size(); i++){
        int numeroAtual = numberList.get(i);
        if (numeroAtual < menor){
            menor = numeroAtual;
        }
    }
    System.out.println("O menor número da lista é: " + menor);
    }

    public void exibirNumeros(){
        System.out.println(numberList);
    }
public static void main(String[] args) {
        SomaNumeros somanumeros = new SomaNumeros();
        somanumeros.adicionarNumero(15);
        somanumeros.adicionarNumero(24);
        somanumeros.adicionarNumero(34);
        somanumeros.adicionarNumero(11);
        somanumeros.adicionarNumero(7);
        somanumeros.adicionarNumero(10);
        somanumeros.adicionarNumero(8);



        somanumeros.encontrarMenorNumero();

        somanumeros.encontrarMaiorNumero();

        somanumeros.calcularSoma();

        somanumeros.exibirNumeros();
    }
}

 

