package Colecoes.Exercicio02;

public class BrownieDoceDeLeite extends Brownie{
    public BrownieDoceDeLeite(String nome, int preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaMaisDoceDeLeite(){
        System.out.println(super.nome + "Adicionando mais Doce de Leite");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de Doce de Leite sendo adicionando ao carrinho de compras");
    }
}
