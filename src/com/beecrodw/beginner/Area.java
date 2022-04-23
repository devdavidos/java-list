package com.beecrodw.beginner;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A,B,C,pi,triangulo,circulo,trapezio,quadrado,retangulo;

        pi = 3.14159;

        System.out.println("A: ");
        A = scan.nextDouble();

        System.out.println("B: ");
        B = scan.nextDouble();

        System.out.println("C: ");
        C = scan.nextDouble();

        triangulo = (A * C) / 2;
        circulo = pi * Math.pow(C,2);
        trapezio = ((A + B) * C) /2;
        quadrado = Math.pow(B,2);
        retangulo = A * B;

        System.out.printf("\nTRIANGULO: %.3f", triangulo);
        System.out.printf("\nCIRCULO: %.3f", circulo);
        System.out.printf("\nTRAPEZIO: %.3f", trapezio);
        System.out.printf("\nQUADRADO: %.3f", quadrado);
        System.out.printf("\nRETANGULO: %.3f", retangulo);
    }
}
