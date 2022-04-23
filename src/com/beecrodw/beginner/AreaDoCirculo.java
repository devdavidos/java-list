package com.beecrodw.beginner;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area, n, raio;
        n = 3.14159;

        System.out.println("Insira o valor do raio: ");
        raio = scan.nextDouble();

        area = n * Math.pow(raio,2);

        System.out.printf("A= %.4f", area);
    }
}
