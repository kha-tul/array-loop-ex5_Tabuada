package ex5_Tabuada;

import java.util.Scanner;

public class ex_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        //começar o contador com 1. o i é count é = a variavel i abaixo.
        for(int i = 1; i <= 10; i++ ){
        // ou i = i + 1.
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
