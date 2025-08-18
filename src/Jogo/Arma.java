package Jogo;

public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostraInfoArma(){
        System.out.println("Nome da arma: "+ nome);
        System.out.println("Poder de fogo: " + poder);
        System.out.println("Descrição: " + descricao);
        System.out.println("Resistente: "+ resistencia);
    }
}
