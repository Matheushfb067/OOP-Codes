package Zumbis03;

public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 50;

        System.out.println("Vida inicial: ");
        System.out.println("Zumbi 1: " + z1.mostrarVida());
        System.out.println("Zumbi 2: " + z2.mostrarVida());

        z1 = z2;

        z1.vida = 80;
        z2.vida = 30;

        System.out.println("Vida após: ");
        System.out.println("Zumbi 1: " + z1.mostrarVida());
        System.out.println("Zumbi 2: " + z2.mostrarVida());
    }
}
