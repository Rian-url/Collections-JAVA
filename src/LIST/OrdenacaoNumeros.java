package LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros  {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
    this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordernarAscendente() {
        List<Integer> OrdenadaAscendente = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(OrdenadaAscendente);
            return OrdenadaAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordernarDescendente() {
        List<Integer> OrdenadaAscendente = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            OrdenadaAscendente.sort(Collections.reverseOrder());
            return OrdenadaAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        } else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args){
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();

        listaNumeros.adicionarNumero(13);
        listaNumeros.adicionarNumero(26);
        listaNumeros.adicionarNumero(52);
        listaNumeros.adicionarNumero(102);

        listaNumeros.exibirNumeros();

        System.out.println("Lista em ordem ascendente:" + listaNumeros.ordernarAscendente());
        System.out.println("Lista em ordem descendente:" + listaNumeros.ordernarDescendente());
    }




}
