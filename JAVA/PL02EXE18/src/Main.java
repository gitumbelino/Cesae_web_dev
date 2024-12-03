
//18. Dado um conjunto de n números inteiros inseridos pelo utilizador, faça um algoritmo que calcule a média dos
//valores maiores que 4

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double soma = 0;
        double cont = 0;

        System.out.println("quantos valores quer inserir?");
        int quant = in.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("insira o " + (i + 1) + " º numero");
            double numero = in.nextDouble();

            if (numero > 4) {
            soma += numero;
            cont++;


            }


double media = soma / cont;
            System.out.println("a média é " + media);
        }


    }
}