package Zumbis03;

public class Zumbi {
    double vida;
    String nome;

    double mostrarVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}
