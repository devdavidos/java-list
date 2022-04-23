package com.beecrodw.beginner;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numPecasUm, numPecasDois;
        double valorUnitarioPecaUm, valorUnitarioPecaDois, valorAPagar;

        System.out.println("Número de Peças um: ");
        numPecasUm = scan.nextInt();

        System.out.println("Valor da peça um R$ ");
        valorUnitarioPecaUm = scan.nextDouble();

        System.out.println("Número de Peças dois: ");
        numPecasDois = scan.nextInt();

        System.out.println("Valor da peça dois R$ ");
        valorUnitarioPecaDois = scan.nextDouble();

        valorAPagar = (numPecasUm * valorUnitarioPecaUm) + (numPecasDois * valorUnitarioPecaDois);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorAPagar);

    }
}
