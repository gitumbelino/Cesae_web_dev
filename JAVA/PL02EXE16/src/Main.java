

//Dado uma série de 20 valores inteiros, faça um algoritmo que calcule e escreva a média aritmética destes valores.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int quantidade = 20;
        double soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("insira o " + i + "º número");
            // double numero = in.nextInt();
            //soma += numero;
            // ou então
            soma += in.nextDouble();

        }
//        double media = soma / quantidade;
//        System.out.println("a média é: " + media);
//        ou entao

        System.out.println("a media é: " + soma / quantidade);

    }
}