package HerancaPolimorfismo.Brownie02;

public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionando Nutella...");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando ao carrinho um: " + nome);
    }
}
