package HerancaPolimorfismo.Brownie02;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando no carrinho de compras um: " + nome);
    }

    public void calculaValorTotalCompra(){
        System.out.println("Calculando valor total de compras" + nome + ": " +preco);
    }

    public void mostraInfo(){
        System.out.println("=====Informações do Brownie=====");
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Sabor: " + sabor);
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public String getSabor(){
        return sabor;
    }
}
