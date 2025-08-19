import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributo
    private Map<String, Integer> contagemMap;

    public Map<String, Integer> getContagemMap() {
        return contagemMap;
    }

    public void setContagemMap(Map<String, Integer> contagemMap) {
        this.contagemMap = contagemMap;
    }

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemMap.isEmpty()){
            contagemMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemMap);
        }
    
    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        System.out.println(maiorContagem);
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavra = new ContagemPalavras();

        contagemPalavra.adicionarPalavra("palavra1", 1);
        contagemPalavra.adicionarPalavra("palavra2", 1);
        contagemPalavra.adicionarPalavra("palavra3", 1);
        contagemPalavra.adicionarPalavra("palavra4", 3);
        contagemPalavra.adicionarPalavra("palavra5", 2);
        contagemPalavra.adicionarPalavra("palavra6", 3);
        contagemPalavra.adicionarPalavra("palavra75", 4);
        contagemPalavra.adicionarPalavra("palavra77", 4);
        contagemPalavra.adicionarPalavra("palavra41", 4);
        contagemPalavra.adicionarPalavra("palavra65", 4);
        contagemPalavra.adicionarPalavra("palavra88", 4);
        contagemPalavra.adicionarPalavra("palavra8", 5);   
        contagemPalavra.adicionarPalavra("palavra9", 5);
        contagemPalavra.adicionarPalavra("palavra10", 3);       
        


        contagemPalavra.encontrarPalavraMaisFrequente();
    }
}    

