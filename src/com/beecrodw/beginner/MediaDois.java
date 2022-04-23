package com.beecrodw.beginner;

import java.util.Scanner;

public class MediaDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A,B,C,MEDIA;

        System.out.println("A: ");
        A = scan.nextDouble();

        System.out.println("B: ");
        B = scan.nextDouble();

        System.out.println("C: ");
        C = scan.nextDouble();

        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("MEDIA: %.1f", MEDIA );
    }
}
