package com.beecrodw.beginner;

import java.util.Scanner;

public class GastosDeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tempoGasto, velocidadeMedia;
        double distanciaPercorrida, consumoCombustivel;

        System.out.println("Digite a distancia percorrida: ");
        distanciaPercorrida = scan.nextInt();

        System.out.println("Digite o tempo gasto: ");
        tempoGasto = scan.nextInt();

        velocidadeMedia = 12;

        consumoCombustivel = (distanciaPercorrida / velocidadeMedia) * tempoGasto;

        System.out.printf("%.3f", consumoCombustivel);
    }
}
