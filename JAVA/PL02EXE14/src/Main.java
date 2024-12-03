import java.util.Scanner;

// Faça um programa que utilize a estrutura ENQUANTO para ler 50 números e calcule e exiba a média aritmética
//deles.


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        int soma = 0;
//        int contador = 0;
//
//        while (contador < 5) {
//            System.out.println("Insira um numero:");
//            int i= in.nextInt();
//            System.out.println(i);
//            soma += i;
//            System.out.println(soma);
//            contador ++;
//            System.out.println(contador);


        int quantidade = 5;
        int i = 1;
        double soma = 0;
        while (i <= quantidade) {
            System.out.println("insira um nr");
            double numero = in.nextInt();
            soma = soma + numero;
            //ou entao soma += numero, quer dizer a mesma coisa
            i++;
        }

        double media = soma / quantidade;
        System.out.println("a média é: " + media);

    }

//        double media= (double) soma/contador;
//
//        System.out.println("a media da soma destes números é" + media );


}

