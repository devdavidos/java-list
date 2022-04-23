package com.beecrodw.beginner;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double distanciaTotalPercorrida, totalCombustivelGasto, consumoMedio;

        System.out.println("Distancia percorrida: ");
        distanciaTotalPercorrida = scan.nextDouble();

        System.out.println("Combustivel total gasto: ");
        totalCombustivelGasto = scan.nextDouble();

        consumoMedio = distanciaTotalPercorrida / totalCombustivelGasto;

        System.out.printf("%.3f km/l", consumoMedio);


    }
}
