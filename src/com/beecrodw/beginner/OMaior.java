package com.beecrodw.beginner;

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, s, maiorAB, maiorABC;

       System.out.println("A: ");
       a = scan.nextInt();

       System.out.println("B: ");
       b = scan.nextInt();

       System.out.println("C: ");
       s = scan.nextInt();

        maiorAB = (a + b + Math.abs(a-b)) / 2;
        maiorABC = (maiorAB + s + Math.abs(maiorAB - s)) / 2;

        System.out.println(maiorABC + " eh o maior");

    }
}
