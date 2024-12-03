import java.util.Scanner;

//Faça um programa que receba 3 valores que representarão os lados de um triângulo e verifique se os valores
//formam um triângulo e classifique esse triângulo como:
//• Equilátero (3 lados iguais);
//• Isósceles (2 lados iguais);
//• Escaleno (3 lados diferentes).
//De notar que para formar um triângulo:
//• Nenhum dos lados pode ser igual a zero;
//• Um lado não pode ser maior do que a soma dos outros dois;
// System.out.println("insira o 1º valor");
//        int n1 = in.nextInt();
//
//        System.out.println("insira o 2º valor");
//        int n2 = in.nextInt();
//
//        System.out.println("insira o 3º valor");
//        int n3 = in.nextInt();
//
//        if (n1 == 0 || n2 == 0 || n3 == 0) {
//            System.out.println("nenhum dos valores pode ser 0");
//
//        } else if (n1 < n2 + n3 || n2 < n1 + n3 || n3 < n1 + n2) {
//            System.out.println("o lado não pode ser maior que soma dos outros 2");
//        }
//
//        if (n1 == n2 && n1 == n3) {
//            System.out.println("o triangulo é equilatero");
//
//        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
//            System.out.println("o triangulo é isósceles");
//        } else {
//            System.out.println("o triangulo é escaleno");
//        }


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("insira um codigo");
        int codigo = in.nextInt();



        switch (codigo) {
            case 001:
                System.out.println("001-Parafuso");
                break;

            case 002:
                System.out.println("002-Porca");
                break;

            case 003:
                System.out.println("001-Prego");
                break;

            default:
                System.out.println("Não definido");
        }
    }
}

