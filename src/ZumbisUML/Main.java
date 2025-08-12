package ZumbisUML;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 100;
        zumbi2.vida = 50;

        System.out.println(zumbi1.mostrarVida());
        System.out.println(zumbi2.mostrarVida());

        System.out.println("--------------------------");

        zumbi2.transfereVida(zumbi1, 40);

        System.out.println(zumbi1.mostrarVida());
        System.out.println(zumbi2.mostrarVida());
    }
}
