package MAP;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
        System.out.println("Palavra adicionada!");
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){

            if(dicionarioMap.containsKey(palavra)){
                dicionarioMap.remove(palavra);
                System.out.println("A palavra: " + palavra + ", foi removida");
            } else{
                System.out.println("Valor não encontrado!");
            }

        } else{
            System.out.println("O map está vazio!");
        }
    }

    public void exibirPalavras(){
        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);

        } else{
            System.out.println("O map está vazio!");
        }
    }

    public String pesquisarPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            String palavraPesquisada = dicionarioMap.get(palavra);

             if(palavraPesquisada == null){
                 System.out.println("Valor não encontrado!");
             } else {
                 return palavraPesquisada;
             }
        }
        return "O map está vazio!";
    }

    public static void main(String[] args){
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Controle", "Controlador");
        dicionario.adicionarPalavra("Carregador", "Carregar");
        dicionario.adicionarPalavra("Telefone", "Ligar");
        dicionario.adicionarPalavra("Roda", "Rodar");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Telefone");

        System.out.println("A palavra pesquisada foi a: " + dicionario.pesquisarPalavra("Controle") );

        dicionario.exibirPalavras();

    }
}
