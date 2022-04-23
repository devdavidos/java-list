package com.beecrodw.beginner;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number, horasTrabalhadas;
        double valorHora, salario;

        System.out.println("Número do funcionário: ");
        number = scan.nextInt();

        System.out.println("Horas trabalhadas: ");
        horasTrabalhadas = scan.nextInt();

        System.out.println("Valor sálario por hora: U$ ");
        valorHora = scan.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f", salario);

    }
}
