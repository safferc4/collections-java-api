
import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    private String nome;

    public Aluno(String nome, int matricula, int media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    private int matricula;

    private int media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getmedia() {
        return media;
    }

    public void setmedia(int media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", media=" + media + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + matricula;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

}

    class ComparatorPorMedia implements Comparator<Aluno>{

        @Override
        public int compare(Aluno m1, Aluno m2) {
            return Integer.compare(m1.getmedia(), m2.getmedia());
    }
}