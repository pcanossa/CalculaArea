package anishelter.com.br;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "*******************************************************************");
        System.out.println("                             CALCULA ÁREA");
        System.out.println( "*******************************************************************");
        Boolean valid = false;
        int entrada = 0;
        while (valid != true) {
            System.out.println("Forma a ser calculada:");
            System.out.println("1- Quadrado");
            System.out.println("2- Retângulo");
            System.out.println("3- Triângulo");
            entrada = scan.nextInt();

            if (entrada == 1 || entrada == 2 || entrada == 3) {
                valid = true;
            } else {
                System.out.println("Opção escolhida inexistente, selecionar entre 1 2 ou 3");
                System.out.println("");
            }
        }
            if (entrada == 1) {
                System.out.println("Digite o lado do quadrado: ");
                double lado = scan.nextDouble();
                 Quadrilatero.area(lado);
            } else if (entrada == 2) {
                System.out.println("Digite a base do retângulo: ");
                double lado1 = scan.nextDouble();
                System.out.println("Digite a altura do retângulo: ");
                double lado2 = scan.nextDouble();
                Quadrilatero.area(lado1, lado2);
            }if (entrada == 3) {
                System.out.println("Digite a base maior do triãngulo: ");
                double baseMaior = scan.nextDouble();
                System.out.println("Digite a base menor do triãngulo: ");
                double baseMenor = scan.nextDouble();
                System.out.println("Digite a altura do triãngulo: ");
                double altura = scan.nextDouble();
                Quadrilatero.area(baseMaior, baseMenor, altura);
            }



    }
}

