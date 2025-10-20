package HerancaPolimorfismo.Brownie03;

import HerancaPolimorfismo.Brownie03.BrownieDoceDeLeite;
import HerancaPolimorfismo.Brownie03.BrownieNutella;

public class Main {
    public static void main(String[] args) {
        BrownieCafe bwCafe  = new BrownieCafe("Brownie de Cafe", 20, "Cafe");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella", 10, "Nutella");
        BrownieDoceDeLeite bwDoce = new BrownieDoceDeLeite("Brownie de Doce", 15, "Doce");
        Comprador comprador = new Comprador("Matheus", 200);

        //Café
        bwCafe.addCarrinhoDeCompras();
        bwCafe.mostraInfo();
        bwCafe.calculaTotalCompra();
        bwCafe.adicionaCafe();
        comprador.efetuarCompra(bwCafe);

        //Doce:
        bwDoce.addCarrinhoDeCompras();
        bwDoce.mostraInfo();
        bwDoce.calculaTotalCompra();
        bwDoce.adicionaDoceDeLeite();
        comprador.efetuarCompra(bwDoce);

        //Nutella:
        bwNutella.mostraInfo();
        bwNutella.addCarrinhoDeCompras();
        bwNutella.calculaTotalCompra();
        bwNutella.adicionaNutella();
        comprador.efetuarCompra(bwNutella);
    }
}
