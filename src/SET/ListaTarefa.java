package SET;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {

    private Set<Tarefa> tarefaConjunto;

    public ListaTarefa(){
        this.tarefaConjunto = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaConjunto.add( new Tarefa(descricao));
        System.out.println("Tarefa adicionada!");
    }

    public void removerTarefa(String descricao){
        if(!tarefaConjunto.isEmpty()){
            for(Tarefa t : tarefaConjunto){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaConjunto.remove(t);
                    System.out.println("Tarefa removida!");

                } else{
                    System.out.println("Tarefa não encontrada!");
                }
            }
        } else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirTarefas(){
        if(!tarefaConjunto.isEmpty()){
            System.out.println("Conjunto de tarefas: " + tarefaConjunto);
        } else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public int contarTarefas(){
        return tarefaConjunto.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        if(!tarefaConjunto.isEmpty()){
            Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for (Tarefa t : tarefaConjunto){
                if (!t.isStatusPendente()){
                    tarefasConcluidas.add(t);
                } else{
                    System.out.println("Nenhuma tarefa foi concluída!");
                }
            }
            return tarefasConcluidas;
        } else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Tarefa> obterTarefasPendente(){
        if(!tarefaConjunto.isEmpty()){
            Set<Tarefa> tarefasPedente = new HashSet<>();
            for (Tarefa t : tarefaConjunto){
                if (t.isStatusPendente() == true ){
                    tarefasPedente.add(t);
                } else{
                    System.out.println("Nenhuma tarefa está pendente!");
                }
            }
            return tarefasPedente;
        } else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaConjunto.isEmpty()){
            for (Tarefa t : tarefaConjunto){
                if (t.getDescricao().equalsIgnoreCase(descricao)){

                    if(t.isStatusPendente()) {
                        t.setStatusPendente(false);
                        System.out.println("Tarefa feita com sucesso!");
                     } else{
                        System.out.println("Tarefa já está registrada como conluída!");
                    }

                } else{
                    System.out.println("Tarefa não econtrada!");
                }
            }

        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefaConjunto.isEmpty()){
            for (Tarefa t : tarefaConjunto){
                if (t.getDescricao().equalsIgnoreCase(descricao)){

                    if(!t.isStatusPendente()) {
                       t.setStatusPendente(true);
                       System.out.println("Tarefa pendente!");
                    } else{
                         System.out.println("Tarefa já está registrada como pendente!");
                }

                } else{
                    System.out.println("Tarefa não econtrada!");
                }
            }

        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public void limparListaTarefas(){
        tarefaConjunto.removeAll(tarefaConjunto);
    }

    public static void main(String[] arg){
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Limpar o teclado");
        listaTarefa.adicionarTarefa("Tirar o pó da mesa");
        listaTarefa.adicionarTarefa("Organizar meu Linkedin");
        listaTarefa.adicionarTarefa("Organizar meu GitHub");

        listaTarefa.exibirTarefas();
        System.out.println("Total de tarefas:" + listaTarefa.contarTarefas());

        listaTarefa.removerTarefa("Limpar o teclado");

        listaTarefa.exibirTarefas();
        System.out.println("Total de tarefas:" + listaTarefa.contarTarefas());

        System.out.println(listaTarefa.obterTarefasConcluidas());
        System.out.println(listaTarefa.obterTarefasPendente());

        listaTarefa.marcarTarefaConcluida("Organizar meu GitHub");
        listaTarefa.marcarTarefaConcluida("Tirar o pó da mesa");
        System.out.println(listaTarefa.obterTarefasConcluidas());

        listaTarefa.marcarTarefaPendente("Tirar o pó da mesa");
        System.out.println(listaTarefa.obterTarefasConcluidas());
        System.out.println(listaTarefa.obterTarefasPendente());

        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();
    }


}
