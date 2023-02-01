package com.juaracoding.iwjavafundamental.cobacoba;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Iqbal Wibisono  a.k.a Iqbal Wibisono
Java Developer
Created on 01/02/2023 18:21
@Last Modified 01/02/2023 18:21
Version 1.1
*/

import java.util.Scanner;
public class LuasBangunDatar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Panggil method Hitung Luas Lingkaran");
        System.out.print("Masukkan Jari-Jari: ");
        double r = input.nextDouble();
        System.out.println("Anda menghitung luas lingkaran dengan input jari-jari " + r + " cm");
        System.out.println("Luas lingkaran adalah " + luasLingkaran(r) + " cm^2");

        System.out.println("\nPanggil method Hitung Luas Persegi Panjang");
        System.out.print("Masukkan Panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan Lebar: ");
        int l = input.nextInt();
        System.out.println("Anda menghitung luas persegi panjang dengan input panjang " + p + " cm dan lebar " + l + " cm");
        System.out.println("Luas persegi panjang adalah " + luasPersegiPanjang(p, l) + " cm^2");

        input.close();
    }

    public static double luasLingkaran(double r) {
        return 3.14 * (r * r);
    }

    public static int luasPersegiPanjang(int p, int l) {
        return p * l;
    }
}



