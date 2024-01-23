package LIST;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade){
        itemList.add( new Item(nome, preco, quantidade));
        System.out.println("Item adicionado com sucesso!");
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if (i.getNome() == nome){
                    itemsParaRemover.add(i);
                }
            }
            itemList.removeAll(itemsParaRemover);
            System.out.println("Item foi excluído com sucesso!");
        } else{
            System.out.println("Nenhum item foi excluído!");
        }
    }

    public Double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item i : itemList){
             double precoTotalItem = i.getPreco() * i.getQuantidade();
             valorTotal += precoTotalItem;

            }
            return  valorTotal;
        } else{
            throw new RuntimeException("A lista de itens está vazia!");
        }
    }

    public void exibirItems(){
        if(!itemList.isEmpty()){
         System.out.println(this.itemList);
        } else{
            System.out.println("A lista de itens está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Bola de futebol", 35.50, 2);
        carrinhoDeCompras.adicionarItem("Mouse", 50.00, 12);
        carrinhoDeCompras.adicionarItem("Teclaco mecânico", 200.00, 35);
        carrinhoDeCompras.adicionarItem("Controle remoto ", 20.00, 20);
        carrinhoDeCompras.adicionarItem("Carregador de pilha", 65.00, 5);

        carrinhoDeCompras.exibirItems();

        System.out.println("Valor total do carrinho de compras R$:"+ carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Bola de futebol");

        carrinhoDeCompras.exibirItems();

        System.out.println("Valor total do carrinho de compras R$:"+ carrinhoDeCompras.calcularValorTotal());

    }



}

