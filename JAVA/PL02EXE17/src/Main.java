import java.util.Scanner;

// Adapte o exercício anterior considerando que se a média obtida for maior que 8 deverá ser atribuída 10 para a média.

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quantidade = 20;
        double soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            double numero = in.nextInt();
            soma = soma + numero;

        }
        double media = soma / quantidade;

        if (media >= 8) {
            System.out.println("a média é 10");
        }

        else {
            System.out.println("a média destes valore é de: " + media);
        }


    }
}