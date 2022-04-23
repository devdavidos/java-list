package com.beecrodw.beginner;

import java.util.Scanner;

public class MediaUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A,B,MEDIA;

        System.out.println("Nota A: ");
        A = scan.nextDouble();

        System.out.println("Nota B: ");
        B = scan.nextDouble();

        MEDIA = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f", MEDIA);
    }
}
