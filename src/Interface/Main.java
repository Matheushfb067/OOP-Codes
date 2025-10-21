package Interface;

import Interface.Boi;
import Interface.Cachorro;
import Interface.Lontra;
import Interface.Mamifero;

public class Main {
    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro("Pirata", 4);
        Mamifero boi = new Boi("Ferdinando", 3);
        Lontra lontra = new Lontra("Pipoca", 9);

        cachorro.emitirSom();
        boi.emitirSom();
        lontra.emitirSom();
        lontra.nadar();

        cachorro.mostraInfo();
        boi.mostraInfo();
        lontra.mostraInfo();
    }
}
