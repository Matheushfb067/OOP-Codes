package Zumbis04;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 100;
        zumbi2.vida = 50;

        System.out.println("Antes da Transferência");
        System.out.println("Zumbi 1: " + zumbi1.mostrarVida());
        System.out.println("Zumbi 2: " + zumbi2.mostrarVida());

        boolean ok = zumbi2.transfereVida(zumbi1, 40);

        if(ok){
            System.out.println("Transferência realizada com sucesso!");
        }else{
            System.out.println("Falha na transferência!");
        }

        System.out.println("Vida após a transferencia: ");
        System.out.println("Zumbi 1: " + zumbi1.mostrarVida());
        System.out.println("Zumbi 2: " + zumbi2.mostrarVida());
    }
}
