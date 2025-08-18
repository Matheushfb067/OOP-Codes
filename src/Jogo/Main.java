package Jogo;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Arma arma = new Arma();

        personagem.nome = "Matheus";
        personagem.pontos = 100;

        arma.nome = "Scar";
        arma.poder = 56;
        arma.resistencia = 44;
        arma.descricao = "A SCAR é um fuzil de assalto modular e versátil,conhecido por sua precisão, " +
                "confiabilidade e uso em forças militares de elite.";

        personagem.arma = arma;

        personagem.usarArma();
        personagem.tomarDano();
        arma.mostraInfoArma();
    }
}
