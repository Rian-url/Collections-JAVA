package SET;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long matricula;
    private double mediaNota;

    public Aluno(String nome, Long matricula, double mediaNota){
        this.nome = nome;
        this.matricula = matricula;
        this.mediaNota = mediaNota;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMediaNota() {
        return mediaNota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public String toString() {
        return "\n Aluno: {" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", mediaNota=" + mediaNota +
                '}';
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.getNome());
    }

//    class ComparatorNota implements Comparator<Aluno>{
//
//        @Override
//        public int compare(Aluno a1, Aluno a2) {
//            return Double.compare(a1.getMediaNota(), a2.getMediaNota());
//        }
//    }

    class ComparatorNota implements Comparator<Aluno> {
        @Override
        public int compare(Aluno o1, Aluno o2) {
            return Double.compare(o1.getMediaNota(), o2.getMediaNota());
        }
    }
}
