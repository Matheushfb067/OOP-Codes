package MarioKart;

public class Main {
    public static void main(String[] args) {

        //Criação dos objetos:
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        //Atribuições:
        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        kart1.nome = "kart1";
        kart2.nome = "kart2";

        piloto1.nome = "Matheus";
        piloto2.nome = "Chris";

        piloto2.vilao = true;

        kart1.motor.cilindradas = "50";
        kart2.motor.cilindradas = "100";

        kart1.motor.velocidadeMaxima = 120;
        kart2.motor.velocidadeMaxima = 96;

        //Chamando os metodos:
        kart1.pular();
        kart2.fazerDrift();
        kart1.soltarTurbo();
        kart1.piloto.soltaSuperPoder();
        kart2.pular();
        kart2.piloto.soltaSuperPoder();
    }
}
