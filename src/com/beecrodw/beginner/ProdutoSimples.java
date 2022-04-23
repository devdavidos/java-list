package com.beecrodw.beginner;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A,B,PROD;

        System.out.println("A: ");
        A = scan.nextInt();

        System.out.println("B: ");
        B = scan.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);


    }
}
