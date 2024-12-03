import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//19. Crie um programa que permita converter um valor em horas para segundos e mostre o valor em segundos


        Scanner in = new Scanner(System.in);
        System.out.println("indique um valor de horas e minutos");
        double horas = Scanner.nextDouble();
        double segundos = horas * 3600;

        System.out.println(horas + "corresponde a" + segundos+ "segundos");





    }
}