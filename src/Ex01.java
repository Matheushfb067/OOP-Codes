public class Ex01 {
    public static void main(String[] args) {
        /*Exercício 1 – Zé do Lanche
        Você e seus amigos estão no famoso trailler do Zé e querem computar quantos lanches
        foram consumidos nas últimas três horas. Na primeira hora foram 10, na segunda 4 e na terceira 2.
        Faça um programa que calcule e imprima o número total e a média de lanches consumidos.*/

        int lanches1 = 10;
        int lanches2 = 4;
        int lanches3 = 2;

        int soma = lanches1 + lanches2 + lanches3;
        //Se uma variavel for do tipo double, o divisor tem que ser com ponto flutuante!
        /*Podemos também fazer o casting do numero, da seguinte forma:
        double media = soma / (double)3;*/
        double media = soma/3.0;

        System.out.println("Total de lanches: " + soma);
        System.out.printf("Media de lanches: %.2f", media);

        /*Como é feita uma entrada de dados em Java:
        Scanner valorTeclado = new Scanner(System.in)*/
    }
}
