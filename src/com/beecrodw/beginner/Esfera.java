package com.beecrodw.beginner;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pi,volume, raio;

        System.out.println("Insira o valor do Raio: ");
        raio = scan.nextDouble();

        pi = 3.14159;

        volume =((4.0/3) * pi) * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f", volume );

    }
}
