package HerancaPolimorfismo.Brownie02;

public class Main {
    public static void main(String[] args) {
        BrownieCafe bwCafe = new BrownieCafe("Brownie de Café", 20, "Café");
        BrownieDoceLeite bwDoce = new BrownieDoceLeite("Brownie de Doce de Leite", 15, "Doce de Leite");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella", 10, "Nutella");

        //Café
        bwCafe.addCarrinhoDeCompras();
        bwCafe.mostraInfo();
        bwCafe.calculaValorTotalCompra();
        bwCafe.adicionaCafe();

        //Doce:
        bwDoce.addCarrinhoDeCompras();
        bwDoce.mostraInfo();
        bwDoce.calculaValorTotalCompra();
        bwDoce.adicionaDoceDeLeite();

        //Nutella:
        bwNutella.mostraInfo();
        bwNutella.addCarrinhoDeCompras();
        bwNutella.calculaValorTotalCompra();
        bwNutella.adicionaNutella();
    }
}
