package SET;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
        System.out.println("Palavra adicionada com sucesso!");
    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicasSet.isEmpty()) {
           if(palavrasUnicasSet.contains(palavra)){
               palavrasUnicasSet.remove(palavra);
               System.out.println("Palavra removida com sucesso!");
           } else{
               System.out.println("Palavra não econtrada no conjunto!");
           }
        } else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra){
        if(!palavrasUnicasSet.isEmpty()){
            return palavrasUnicasSet.contains(palavra);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirPalavras(){
        if(!palavrasUnicasSet.isEmpty()){
            System.out.println("Conjunto de palavras:" + palavrasUnicasSet);
        } else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args){
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("SANTOS");
        conjuntoPalavrasUnicas.adicionarPalavra("FUTEBOL");
        conjuntoPalavrasUnicas.adicionarPalavra("CLUB");
        conjuntoPalavrasUnicas.adicionarPalavra("SÉRIE B");
        conjuntoPalavrasUnicas.adicionarPalavra("BALEIA");
        conjuntoPalavrasUnicas.adicionarPalavra("BALEIA");

        conjuntoPalavrasUnicas.exibirPalavras();

        conjuntoPalavrasUnicas.removerPalavra("SÉRIE B");

        System.out.println("Existe palavra SANTOS no conjunto?" + conjuntoPalavrasUnicas.verificarPalavra("SÉRIE B"));

        conjuntoPalavrasUnicas.exibirPalavras();



    }

}
