package MarioKart;

public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    //Contrutor:
    public Kart(){
        motor = new Motor();
    }

    //Metodos:
    void pular(){
        System.out.println("Pulo!!!!!!!");
    }

    void soltarTurbo(){
        System.out.println("Turbo Ativado!!!!!");
    }

    void fazerDrift(){
        System.out.println("Drift!!!!!");
    }
}
