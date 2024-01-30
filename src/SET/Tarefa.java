package SET;

public class Tarefa {
    private String descricao;
    private boolean statusPendente;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.statusPendente = true;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatusPendente() {
        return statusPendente;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatusPendente(boolean statusPendente) {
        this.statusPendente = statusPendente;
    }

    @Override
    public String toString() {
        return "Tarefa {" +
                "descricao= '" + descricao + '\'' +
                ", statusPendente = " + statusPendente +
                "} \n";
    }
}
