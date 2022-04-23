package com.beecrodw.beginner;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A,B,C,D,DIFERENCA;

        System.out.println("A: ");
        A = scan.nextInt();

        System.out.println("B: ");
        B = scan.nextInt();

        System.out.println("C: ");
        C = scan.nextInt();

        System.out.println("D: ");
        D = scan.nextInt();

        DIFERENCA = ((A * B) - (C * D));

        System.out.println("DIFERENCA = " + DIFERENCA);

    }
}
