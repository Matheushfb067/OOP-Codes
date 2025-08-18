package Jogo;

public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    void usarArma(){
        arma.resistencia -= 2;
        System.out.println("A arma foi utilizada! a resistencia agora é: " + arma.resistencia);
    }

    void tomarDano(){
        pontos -= 5;
        System.out.println("A vida do personagem agora é: " + pontos);
    }
}
