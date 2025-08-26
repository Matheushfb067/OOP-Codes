package Matrizes;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean [][] campoMinado = new boolean[2][2];

        Random rand = new Random();

        int x = rand.nextInt(2);
        int y = rand.nextInt(2);
        System.out.println(x);
        System.out.println(y);
        campoMinado[x][y] = true;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor da posição i: ");
        int i = entrada.nextInt();
        System.out.println("Entre com o valor da posição j: ");
        int j = entrada.nextInt();

        for(boolean [] linha : campoMinado){
            for(boolean coluna : linha){
                if (i == x && j == y) {
                    System.out.println("BOOOOM!!!");
                    break;
                }
                else {
                    System.out.println("Você Conseguiu!");
                    break;
                }
            }
            break;
        }
    }
}
