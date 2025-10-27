package Colecoes.Exercicio02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Brownie> listaBrownie = new ArrayList<>();

        BrownieCafe bwCafe = new BrownieCafe("Brownie de Café", 10, "Café");
        BrownieDoceDeLeite bwDoce = new BrownieDoceDeLeite("Brownie de Doce de Leite", 30, "Café");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella", 15, "Nutella");

        listaBrownie.add(bwCafe);
        listaBrownie.add(bwDoce);
        listaBrownie.add(bwNutella);

        for (Brownie brownie : listaBrownie){
            System.out.println(brownie.getNome() + ": " +  brownie.getPreco());
        }

        //Ordenação da lista de Brownies
        Collections.sort(listaBrownie);

        for (Brownie brownie : listaBrownie) {
            System.out.println(brownie.getNome() + ": " +  brownie.getPreco());
        }
    }
}
