package com.beecrodw.beginner;

import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,x;

        System.out.println("Insira o valor de A: ");
        a = scan.nextInt();

        System.out.println("Insira o valor de B: ");
        b = scan.nextInt();

        x = a + b;

        System.out.println("X = " + x);

    }
}
