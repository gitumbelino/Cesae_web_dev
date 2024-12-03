import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.println("olá");
        }

        //para mostrar os numeros de 0 a 10

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }
//------------------------------------------------------
        //inverter o processo
        for (int i = 5; i >= 1; i--) {

            System.out.println(i);
        }
//------------------------------------------------------
        //exemplo de ciclo while
        int i = 1;
        while (i <= 10) {

            System.out.println(i);
            i++;
        }
//------------------------------------------------------
// inserir valores até uma condição se verificar, neste caso inserir 0 para parar o ciclo.

        Scanner u = new Scanner(System.in);

        int num = 1;
        while (num != 0) {
            System.out.println("insira um nr, par aparar insira 0");
            num = in.nextInt();
        }
    }

}