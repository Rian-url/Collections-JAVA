package MAP;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    static class CompararPreco implements Comparator<Map.Entry<String, Livro>>{

        @Override
        public int compare(Map.Entry<String, Livro> livro, Map.Entry<String, Livro> livro2) {
            return Double.compare(livro.getValue().getPreco(), livro2.getValue().getPreco());
        }
    }

    @Override
    public String toString() {
        return "Livro :" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco + '\n';
    }
}
