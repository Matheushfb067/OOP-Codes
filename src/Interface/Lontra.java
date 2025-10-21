package Interface;

import Interface.Mamifero;

public class Lontra extends Mamifero implements Aquatico{
    public Lontra(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom(){
        System.out.println("CHIK CHIK CHIK");
    }

    @Override
    public void nadar(){
        System.out.println("Lontra nadando...");
    }
}
