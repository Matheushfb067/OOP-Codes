package ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro("Thor", 4);
        Mamifero lontra = new Lontra("Pipoca", 9);
        Mamifero boi = new Boi("Ferdinando", 3);

        cachorro.emitirSom();
        lontra.emitirSom();
        boi.emitirSom();

        cachorro.mostraInfo();
        lontra.mostraInfo();
        boi.mostraInfo();
    }
}
