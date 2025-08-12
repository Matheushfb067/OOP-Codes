package ZumbisUML;

public class Zumbi {
    double vida;
    String nome;

    double mostrarVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){//zumbi para o qual estou transferindo vida e a quantia
           vida -= quantia;
           zumbiAlvo.vida += quantia;
    }
}
