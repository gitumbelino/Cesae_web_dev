import java.util.Scanner;

// Faça um programa que utilize a estrutura ENQUANTO para ler 50 números e calcule e exiba a média aritmética
//deles.


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        while (contador < 5) {
            System.out.println("Insira um numero:");
            int i= in.nextInt();
            System.out.println(i);
            soma += i;
            System.out.println(soma);
            contador ++;
            System.out.println(contador);

        }

        double media= (double) soma/contador;

        System.out.println("a media da soma destes números é" + media );



    }

}