package Arrays.Exercicio0;

public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        salgado1.nomes = "Coxinha";

        Salgado salgado2 = new Salgado();
        salgado2.nomes = "Esfirra";

        Salgado salgado3 = new Salgado();
        salgado3.nomes = "Enroladinho";

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();
    }
}
