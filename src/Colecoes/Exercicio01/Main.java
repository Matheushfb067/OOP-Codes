package Colecoes.Exercicio01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> listaDouble = new ArrayList<Double>();

        for (int i = 0; i < 5; i++) {
            listaDouble.add(new Random().nextDouble() * 100);
        }

        System.out.println("Ates de ordenar!");

        for(Double d : listaDouble){
            System.out.println(d);
        }

        System.out.println("Depois de ordenar!");

        Collections.sort(listaDouble, Collections.reverseOrder());

        for(Double d : listaDouble){
            System.out.println(d);
        }
    }
}
