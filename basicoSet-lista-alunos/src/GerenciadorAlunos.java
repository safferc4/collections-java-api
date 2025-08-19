
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> gerenciadorAlunoSet;

    public GerenciadorAlunos() {
        this.gerenciadorAlunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula,int media){
        gerenciadorAlunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(int matricula){
       Aluno numMatricula = null;

        for (Aluno a : gerenciadorAlunoSet){
            if (a.getMatricula() == matricula ){
                numMatricula = a;
                break;
            }
        }
        gerenciadorAlunoSet.remove(numMatricula);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(gerenciadorAlunoSet);
        System.out.println(alunosPorNome);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorMedia(){
        Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorPorMedia());
        alunosPorMedia.addAll(gerenciadorAlunoSet);
        System.out.println(alunosPorMedia);
        return alunosPorMedia;
    }

    public void exibirAlunos(){
        System.out.println(gerenciadorAlunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        
        gerenciadorAlunos.adicionarAluno("B", 1, 8);
        gerenciadorAlunos.adicionarAluno("R", 2, 9);
        gerenciadorAlunos.adicionarAluno("Q", 3, 8);
        gerenciadorAlunos.adicionarAluno("W", 4, 7);
        gerenciadorAlunos.adicionarAluno("L", 5, 6);
        gerenciadorAlunos.adicionarAluno("J", 6, 8);
        gerenciadorAlunos.adicionarAluno("Z", 7, 7);
        gerenciadorAlunos.adicionarAluno("G", 8, 4);
        gerenciadorAlunos.adicionarAluno("C", 9, 5);
        gerenciadorAlunos.adicionarAluno("T", 10, 6);
        gerenciadorAlunos.adicionarAluno("U", 11, 10);
        gerenciadorAlunos.adicionarAluno("O", 12, 9);

        gerenciadorAlunos.removerAluno(10);
        gerenciadorAlunos.exibirAlunos();
    }
}
