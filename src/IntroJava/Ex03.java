package IntroJava;

import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        /*
        Exercício 3 – Vida de Estudante!
        Faça um programa que receba uma NPA e informe se o aluno passou ou
        se ficou de NP3. Caso tenha ficado de NP3, informe a nota e faça a soma
        com NPA, para o cálculo da NFA. Imprima se ele passou ou não! Utilize a
        classe Scanner para ler as notas do aluno:

        Dica:
        Scanner entrada = new Scanner(System.in);

        ps: Lembre-se de importar o pacote para a classe Scanner.
        */
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a primeira nota: ");
        float NP1 = entrada.nextFloat();
        System.out.println("Entre com a segunda nota: ");
        float NP2 = entrada.nextFloat();

        float NPA = (NP1 + NP2) / 2;

        if(NPA >= 60) {
            System.out.println("O Aluno Passou!");
        } else if (NPA < 30) {
            System.out.println("O aluno está Reprovado!");
        } else {
            System.out.println("O Aluno Está de NP3!");
        }

        entrada.close();
    }
}
