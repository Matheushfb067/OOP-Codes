package IntroJava;/*
Exercício 5 – Adivinhação!

Faça um programa que gere um número aleatório entre 1 e 10, e
depois pergunte ao usuário qual número foi gerado. O jogo deve
continuar até que o usuário adivinhe o número.

Dica: use Random rand = new Random();
int x = rand.nextInt(10) + 1; //Gera número entre 1
//e 10
*/

import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int x = rand.nextInt(10) + 1; //Gera de 1 à 10!

        int num;

        do{
            System.out.println("Em que numero estou pensando? ");
            num = entrada.nextInt();
            if(x != num)
                System.out.println("Errouuu!");
        }while(x != num);

        System.out.println("Parabens! Você acertou");

        entrada.close();
    }
}
