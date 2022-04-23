package com.beecrodw.beginner;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A,B,SOMA;

        System.out.println("A: ");
        A = scan.nextInt();

        System.out.println("B: ");
        B = scan.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}
