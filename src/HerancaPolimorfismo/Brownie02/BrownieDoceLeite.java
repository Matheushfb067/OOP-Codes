package HerancaPolimorfismo.Brownie02;

public class BrownieDoceLeite extends Brownie {
    public BrownieDoceLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Adicionando Cafe...");
    }
}
