
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> listaTarefaSet;




    public ListaTarefas() {
        this.listaTarefaSet = new HashSet<>();
    }
    

    public void adicionarTarefas(String descricao, boolean concluida){
        listaTarefaSet.add(new Tarefa(descricao, concluida));
    }

    public void removerTarefa(String descricao){
        Set<Tarefa> tarefasParaRemover = new HashSet<>();
        for (Tarefa t : listaTarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
                break;
            }
        }
        listaTarefaSet.remove(tarefasParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(listaTarefaSet);
    }

    public void contarTarefas(){
        System.out.println("A lista contém "+ listaTarefaSet.size()+ " tarefas.");
    }

    public void limparListaTarefas(){
        listaTarefaSet.removeAll(listaTarefaSet);
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;
        for (Tarefa t : listaTarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
                tarefaConcluida = t;
            }
        }
        return tarefaConcluida;
    }
    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for (Tarefa t : listaTarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                tarefaPendente = t;
            }
        }
        return tarefaPendente;
    }
    public void obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidasSet = new HashSet<>();
        for (Tarefa t : listaTarefaSet){
            if (t.isConcluida() == true){
                tarefasConcluidasSet.add(t);
            }
        }
        System.out.println(tarefasConcluidasSet);
    }


        public void obterPendentes(){
        Set<Tarefa> tarefasPendentesSet = new HashSet<>();
        for (Tarefa t : listaTarefaSet){
            if (t.isConcluida() == false){
                tarefasPendentesSet.add(t);
            }
        }
        System.out.println(tarefasPendentesSet);
    }

    public static void main(String[] args) {
        ListaTarefas listarefas = new ListaTarefas();
        listarefas.adicionarTarefas("A", false);
        listarefas.adicionarTarefas("B", false);
        listarefas.adicionarTarefas("C", false);
        listarefas.adicionarTarefas("D", false);
        listarefas.adicionarTarefas("E", false);
        listarefas.adicionarTarefas("F", false);
        listarefas.adicionarTarefas("G", false);
        listarefas.adicionarTarefas("H", false);
        listarefas.adicionarTarefas("I", false);
        listarefas.adicionarTarefas("J", false);
        listarefas.adicionarTarefas("K", false);

        listarefas.contarTarefas();
        listarefas.marcarTarefaConcluida("A");
        listarefas.marcarTarefaConcluida("B");
        listarefas.marcarTarefaConcluida("C");

        listarefas.exibirTarefas();
        listarefas.obterTarefasConcluidas();
        listarefas.obterPendentes();
        listarefas.marcarTarefaPendente("B");
        listarefas.obterPendentes();
    }
 

}

