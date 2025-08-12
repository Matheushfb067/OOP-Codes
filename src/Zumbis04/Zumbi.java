package Zumbis04;

public class Zumbi {
    double vida;
    String nome;

    double mostrarVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){//zumbi para o qual estou transferindo vida e a quantia
        if(vida > 0 && vida <= 100){
            vida -= quantia;
            zumbiAlvo.vida += quantia;

            return true;
        }else {
            return false;
        }
    }
}
