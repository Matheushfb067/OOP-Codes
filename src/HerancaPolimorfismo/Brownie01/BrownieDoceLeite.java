package HerancaPolimorfismo.Brownie01;

public class BrownieDoceLeite extends Brownie{
    public BrownieDoceLeite(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println(super.nome + "Adicionando Doce de Leite...");
    }
}
