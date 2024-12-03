import java.util.Scanner;

//10. Faça um programa que verifique se um número é ímpar


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Verificar se um nr é par ou impar. Insira um nr:");
        int n = in.nextInt();

        if (n%2 == 0 ){
            System.out.println( "o numero inserido é par");
        }

        else {
            System.out.println("o numero inserido é impar");
        }



    }
}