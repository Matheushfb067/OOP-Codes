package LeituraEscritaArquivos.ExemploProfessor;

public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Contador1());
        Thread th2 = new Thread(new Contador2());
        Thread th3 = new Thread(new Contador3());

        th1.start();
        th2.start();
        th3.start();
    }
}
