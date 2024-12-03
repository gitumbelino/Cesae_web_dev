//12. Utilize a estrutura SE para fazer um programa que retorne o nome de um produto a partir do código do mesmo.
//Considere os seguintes códigos:
//• 001 - Parafuso;
//• 002 - Porca;
//• 003 - Prego;
//• Para qualquer outro código indicar “Não definido”.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("que peça pretende adquirir?");
        int parafuso = in.nextInt();
        int porca = in.nextInt();
        int prego = in.nextInt();

        if (parafuso == "001") {
            System.out.println("Parafuso");

            if else(porca == "002") {
                System.out.println("Porca");
            }

            if else(prego == "003") {
                System.out.println("Prego");
            }


    }
}