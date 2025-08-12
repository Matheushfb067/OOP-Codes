package Zumbis;

public class Main {
    //o que um zumbi sabe sobre si ? -> atributos
    // o que ele sabe fazer? -> metodos
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi(); //objeto criado instanciando a classe Zumbi
        Zumbi zumbi2 = new Zumbi();

        //Instancias
        zumbi1.nome = "Matheus";
        zumbi1.vida = 100;
        zumbi2.nome = "Chris";
        zumbi2.vida = 200;

        zumbi1.seAlimentar();
        zumbi2.seAlimentar();


    }
}
