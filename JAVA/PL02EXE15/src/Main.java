import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int quantidade = 5;
        //int i = 1;
        double soma = 0;
        for (int i = 1; i <= quantidade; i++ ) {
            System.out.println("insira um nr");
            double numero = in.nextInt();
            soma = soma + numero;
            //i++;
        }

        double media = soma /quantidade;
        System.out.println("a soma é " + soma);
        System.out.println("a media é " + media);

    }
}