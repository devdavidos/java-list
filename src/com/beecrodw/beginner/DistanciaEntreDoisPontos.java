package com.beecrodw.beginner;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1, x2, y1, y2, distancia;

        System.out.println("X1: ");
        x1 = scan.nextDouble();

        System.out.println("X2: ");
        x2 = scan.nextDouble();

        System.out.println("Y1: ");
        y1 = scan.nextDouble();

        System.out.println("Y2: ");
        y2 = scan.nextDouble();


        distancia = Math.sqrt( Math.pow( (x2 - x1) ,2) + Math.pow( (y2 - y1) ,2));

        System.out.printf("%.4f", distancia);
    }
}
