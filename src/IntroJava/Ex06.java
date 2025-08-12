package IntroJava;/*
Exercício 6 – Adivinhação Aprimorado!
Repita o exercício anterior, mas informe o usuário se o número que ele
digitou é maior ou menor que o gerado pelo computador!
*/

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int x = rand.nextInt(10) + 1; //Gera de 1 à 10!

        int num;

        do{
            System.out.println("Em que numero estou pensando? ");
            num = entrada.nextInt();
            if(x < num)
                System.out.println("MENOR!");
            else if (x > num) {
                System.out.println("MAIOR!");
            }

        }while(x != num);

        System.out.println("Parabens! Você acertou");

        entrada.close();
    }
}
