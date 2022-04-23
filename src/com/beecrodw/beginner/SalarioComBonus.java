package com.beecrodw.beginner;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        double salario, totalVendas, bonus;

        System.out.println("Nome do vendedor: ");
        nome = scan.nextLine();

        System.out.println("Salario: R$ ");
        salario = scan.nextDouble();

        System.out.println("Total em vendas: R$ ");
        totalVendas = scan.nextDouble();

        bonus = salario + ((totalVendas / 100 ) * 15);

        System.out.println("NOME = " + nome);
        System.out.printf("TOTAL= R$ %.2f", bonus);


    }
}
