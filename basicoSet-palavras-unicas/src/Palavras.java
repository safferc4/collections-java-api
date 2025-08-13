import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Palavras {

    private Set<String> palavrasUnicasSet;

    public Palavras() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.palavrasUnicasSet);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Palavras other = (Palavras) obj;
        return Objects.equals(this.palavrasUnicasSet, other.palavrasUnicasSet);
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavrasToRemove = null;
        for (String p : palavrasUnicasSet) {
            if (p.equals(palavra)) {
                palavrasToRemove = p;
                palavrasUnicasSet.remove(palavrasToRemove);
                break;
            }
            else{
                System.out.println("Palavra não encontrada.");
                break;
            }
        }
        
    }

    public void verificarPalavra(String palavra) {
        String palavrasToVerify = null;
        for (String p : palavrasUnicasSet) {
            if (p.equals(palavra)) {
                palavrasToVerify = p;
                System.out.println(palavrasToVerify);
                break;
            }
            else{
                System.out.println("Palavra não encontrada.");
                break;
            }
        }      
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }

    @Override
    public String toString() {
        return "Palavras [palavrasUnicasSet=" + palavrasUnicasSet + "]";
    }

    public static void main(String[] args) {
        Palavras palavrasSet = new Palavras();

        palavrasSet.adicionarPalavra("WOW!");
        palavrasSet.adicionarPalavra("OMG");
        palavrasSet.adicionarPalavra("carambolas");
        palavrasSet.adicionarPalavra("poxavida");
        palavrasSet.adicionarPalavra("minecraft");
        palavrasSet.adicionarPalavra("treino");
        palavrasSet.adicionarPalavra("rap");
        palavrasSet.adicionarPalavra("horadeaventura");
        palavrasSet.adicionarPalavra("guindastes");
        palavrasSet.adicionarPalavra("MOTOSERRAA!");

        palavrasSet.exibirPalavrasUnicas();

        //palavrasSet.verificarPalavra("gangues");

        //palavrasSet.removerPalavra("bunda");

        palavrasSet.removerPalavra("MOTOSERRAA!");
        palavrasSet.removerPalavra("rap");

        palavrasSet.exibirPalavrasUnicas();

    }
}
