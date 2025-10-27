package Colecoes.Exercicio02;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, int preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaMaisCafe(){
        System.out.println(super.nome + "Adicionando mais cafe");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de Café sendo adicionando ao carrinho de compras");
    }
}
