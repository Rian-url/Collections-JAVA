package MAP;

import java.util.*;

public class LivrariaOnline {

    private Map <String, Livro> livrariaMap;

    public LivrariaOnline(){
        livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor,  double preco){
        livrariaMap.put( link, new Livro(titulo, autor, preco));
        System.out.println("Livro adicionado!");
    }

    public void removerLivro(String titulo){
        if (!livrariaMap.isEmpty()){

            List<String> livrosParaRemover = new ArrayList<>();

            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    livrosParaRemover.add(entry.getKey());
                }
            }

            for (String livro : livrosParaRemover){
                livrosParaRemover.remove(livro);
            }

//            if (livrariaMap.containsValue(titulo)){
//                livrariaMap.remove(titulo);
//            } else {
//                System.out.println("Livro não encontrado!");
//            }

        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public Map<String, Livro> exibirLivrosPorPreco(){
        if (!livrariaMap.isEmpty()){
            List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaMap.entrySet());

            Collections.sort(livrosParaOrdenarPorPreco, new Livro.CompararPreco());

            Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

            for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco){
                livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
            }

            return livrosOrdenadosPorPreco;

        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Map<String,Livro> pesquisarLivroPorAutor(String autor){
        if (!livrariaMap.isEmpty()){
            Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();

            for (Map.Entry<String,Livro> entry : livrariaMap.entrySet()){
                Livro livro = entry.getValue();

                if (livro.getAutor().equals(autor)){
                    livrosPorAutor.put(entry.getKey(), livro);
                } else {
                    System.out.println("Livro não encontrado!");
                }
            }
            return livrosPorAutor;

        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

}
