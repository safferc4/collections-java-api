import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dicionario{");
        sb.append("dicionarioMap=").append(dicionarioMap);
        sb.append('}');
        return sb.toString();
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoPalavra = null;
        if (!dicionarioMap.isEmpty()) {
           definicaoPalavra = dicionarioMap.get(palavra);
        }
        System.out.println(definicaoPalavra);
        return definicaoPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("palavra1","definição1");
        dicionario.adicionarPalavra("palavra2","definição2");
        dicionario.adicionarPalavra("palavra3","definição3");
        dicionario.adicionarPalavra("palavra4","definição4");
        dicionario.adicionarPalavra("palavra5","definição5");
        dicionario.adicionarPalavra("palavra6","definição6");
        dicionario.adicionarPalavra("palavra7","definição7");
        dicionario.adicionarPalavra("palavra8","definição8");



        dicionario.pesquisarPorPalavra("palavra4");

        dicionario.removerPalavra("palavra1");


        dicionario.exibirPalavras();
    }


}
