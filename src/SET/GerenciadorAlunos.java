package SET;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Aluno(nome, matricula, media));
        System.out.println("Aluno adicionado!");
    }


    public void removerAlunoPorMatricula(long matricula) {

        if (!alunosSet.isEmpty()) {
            Aluno alunoParaRemover = null;
            for (Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    System.out.println("Aluno: " + a.getNome() + " foi removido!");
                    break;
                }
            }

            alunosSet.remove(alunoParaRemover);

            if (alunoParaRemover == null) {
                System.out.println("Matricula não encontrada!");
            }

        } else {
            System.out.println("O conjunto está vazio!");
        }


    }

   public void exibirAlunosPorNome(){
       if (!alunosSet.isEmpty()) {
           Set<Aluno> alunosOrdenadosPorNome = new TreeSet<>(alunosSet);
           System.out.println(alunosOrdenadosPorNome);

       } else {
           System.out.println("O conjunto está vazio!");
       }
   }

//    public void exibirAlunosPorMediaNota(){
//        if (!alunosSet.isEmpty()) {
//            Set<Aluno> alunosOrdenadosPorMedia = new TreeSet<>(new Aluno.ComparatorNota() {
//            });
//            System.out.println(alunosOrdenadosPorMedia);
//
//        } else {
//            System.out.println("O conjunto está vazio!");
//        }
//    }

    public void exibirAlunos(){
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }



    public static void main(String[] args){
        GerenciadorAlunos alunosSet = new GerenciadorAlunos();

        alunosSet.adicionarAluno(" a Rian", 1234L, 8 );
        alunosSet.adicionarAluno("c Malcon X", 1267L, 9.2 );
        alunosSet.adicionarAluno("d Ice Cube", 126789L, 9.5 );
        alunosSet.adicionarAluno("g 2Pac", 56874L, 9.3 );

        alunosSet.removerAlunoPorMatricula(1235L);

//        alunosSet.exibirAlunosPorMediaNota();
        alunosSet.exibirAlunosPorNome();
        alunosSet.exibirAlunos();
    }
}
