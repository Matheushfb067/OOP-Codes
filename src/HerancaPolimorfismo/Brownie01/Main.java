package HerancaPolimorfismo.Brownie01;

public class Main {
    public static void main(String[] args) {
        BrownieCafe bwCafe = new BrownieCafe("Brownie de Café", 10, "Café");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella", 70, "Nutella");
        BrownieDoceLeite bwDoce = new BrownieDoceLeite("Brownie de Doce de Leite", 30, "Doce de Leite");


        //Café:
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

