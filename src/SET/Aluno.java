package SET;

public class Aluno {
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
    public String toString() {
        return "\n Aluno: {" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", mediaNota=" + mediaNota +
                '}';
    }
}
