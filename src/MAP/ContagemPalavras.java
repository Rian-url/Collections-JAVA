package MAP;

import java.util.HashMap;
import java.util.Map;


public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras(){
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
        System.out.println("Palavra adicionada!");
    }

    public void removerPalavra(String palavra){
        if(!contagemPalavrasMap.isEmpty()){

            if (contagemPalavrasMap.containsKey(palavra)){
                contagemPalavrasMap.remove(palavra);
                System.out.println("Palavra " + '"' + palavra + '"' + " removida!");
            } else {
                System.out.println("Palavra não encontrada!");
            }

        } else{
            System.out.println("O map está vazio!");
        }
    }

    public void exibirContagemPalavras(){
        if(!contagemPalavrasMap.isEmpty()){
            System.out.println(contagemPalavrasMap);
        }else{
            System.out.println("O map está vazio!");
        }
    }

    public String encontrarPalavraMaisFrequente(){
        if(!contagemPalavrasMap.isEmpty()){
            String palavraMaisRepetida = "";
            int contagemPalavra = 0;

            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
                if(entry.getValue() > contagemPalavra){
                    contagemPalavra = entry.getValue();
                    palavraMaisRepetida = entry.getKey();
                }
            }
              return palavraMaisRepetida;

        } else{
            throw new RuntimeException("O map está vazio!");
        }
    }

    public static void main(String[] args){
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Cachorro", 10);
        contagemPalavras.adicionarPalavra("Armário", 15);
        contagemPalavras.adicionarPalavra("Cama", 12);
        contagemPalavras.adicionarPalavra("Tijolo", 20);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Cachorro");

        contagemPalavras.exibirContagemPalavras();

        System.out.println("Palavra mais pesquisada:" + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
