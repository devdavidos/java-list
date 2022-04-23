package com.beecrodw.beginner;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor,troco, cem, cinquenta, vinte, dez, cinco, dois, um;

        System.out.println("Digite um valor: ");
        valor = scan.nextInt();

        troco = valor;

        cem = troco / 100;
        troco = troco - (cem *  100);

        cinquenta = troco / 50;
        troco = troco - (cinquenta * 50);


        vinte = troco / 20;
        troco = troco - (vinte * 20);

        dez = troco / 10;
        troco = troco - (dez * 10);

        cinco = troco / 5;
        troco = troco - (cinco * 5);

        dois = troco / 2;
        troco = troco - (dois * 2);

        um = troco;

        System.out.println(cem + " notas(s) de R$ 100,00");
        System.out.println(cinquenta + " notas(s) de R$ 50,00");
        System.out.println(vinte + " notas(s) de R$ 20,00");
        System.out.println(dez + " notas(s) de R$ 10,00");
        System.out.println(cinco + " notas(s) de R$ 5,00");
        System.out.println(dois + " notas(s) de R$ 2,00");
        System.out.println(um + " notas(s) de R$ 1,00");
    }
}
