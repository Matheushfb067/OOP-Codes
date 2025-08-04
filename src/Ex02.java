import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        /*
        Exercício 2 – Zé do Lanche 2
        Faça um programa que consiga ler o número de lanches consumidos no
        trailler do Zé. Mostre a soma e a média. Utilize o pacote java.util.Scanner
        para ler os dados e utilize a saída com o método System.out.println()
        */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de lanche1: ");
        int lanches1 = entrada.nextInt();
        System.out.print("Entre com o valor de lanche2: ");
        int lanches2 = entrada.nextInt();
        System.out.print("Entre com o valor de lanche3: ");
        int lanches3 = entrada.nextInt();

        int soma = lanches1 + lanches2 + lanches3;
        //Se uma variavel for do tipo double, o divisor tem que ser com ponto flutuante!
        /*Podemos também fazer o casting do numero, da seguinte forma:
        double media = (double) soma / 3;*/
        double media = soma/3.0;

        System.out.println("Total de lanches: " + soma);
        System.out.printf("Media de lanches: %.2f", media);

        entrada.close();
    }
}