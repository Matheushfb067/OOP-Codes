package Colecoes.Exercicio02;

public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, int preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaMaisNutella(){
        System.out.println(super.nome + "Adicionando mais Nutella");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de Nutella Sendo adicionando ao carrinho de compras");
    }
}
