package HerancaPolimorfismo.Brownie02;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println("Adicionando Cafe...");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando ao carrinho um: " + nome);
    }

}

