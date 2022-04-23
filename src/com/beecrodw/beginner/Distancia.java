package com.beecrodw.beginner;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o KM: ");
        double km = scan.nextDouble();

        double distanciamento = (km * 2);

        System.out.printf("%.0f minutos",distanciamento);
    }
}
