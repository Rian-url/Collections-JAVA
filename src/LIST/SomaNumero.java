package LIST;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {

    private List<Integer> numerosList;

    public SomaNumero() {
        this.numerosList = new ArrayList<>();
    }


    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma(){
        if(!numerosList.isEmpty()){
            int valorSoma = 0;
            for(Integer numero : numerosList){
             valorSoma += numero;
            }
            return valorSoma;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public int encontrarMaiorNumero(){
        if(!numerosList.isEmpty()){
            int maiorNumero = Integer.MIN_VALUE;
            for(Integer numero : numerosList){
             if(numero >= maiorNumero){
                 maiorNumero = numero;
             }
            }
            return maiorNumero;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }


    public int encontrarMenorNumero(){
        if(!numerosList.isEmpty()){
            int menorNumero = Integer.MAX_VALUE;
            for(Integer numero : numerosList){
                if(numero <= menorNumero){
                   menorNumero = numero;
                }
            }
            return menorNumero;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "SomaNumero" + "\n" +
                "numerosList = " + numerosList
                ;
    }

    public void exibirNumeros(){
        if(!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumero listNumeros = new SomaNumero();

        listNumeros.adicionarNumero(13);
        listNumeros.adicionarNumero(26);
        listNumeros.adicionarNumero(52);
        listNumeros.adicionarNumero(104);
        listNumeros.adicionarNumero(105);

        listNumeros.exibirNumeros();

       System.out.println("A soma total da lista de números é de:" + listNumeros.calcularSoma());
       System.out.println("Maior valor da lista:" + listNumeros.encontrarMaiorNumero());
       System.out.println("Menor valor da lista:" + listNumeros.encontrarMenorNumero());
    }

}

