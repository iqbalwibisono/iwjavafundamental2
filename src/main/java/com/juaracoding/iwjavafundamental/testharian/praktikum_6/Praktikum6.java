package com.juaracoding.iwjavafundamental.testharian.praktikum_6;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Iqbal Wibisono  a.k.a Iqbal Wibisono
Java Developer
Created on 09/02/2023 16:21
@Last Modified 09/02/2023 16:21
Version 1.1
*/

import java.util.Scanner;

public class Praktikum6 {
     /*
	        Soal Nomor 2 Praktikum 6 Java Fundamental
         */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] intNumber = new int[100];
        int intCount = 0;
        boolean isRepeat = true;
        while (isRepeat) {
            System.out.print("Masukkan Angka : ");
            while (scanner.hasNextInt()) {
                intNumber[intCount] = scanner.nextInt();
                intCount++;
                System.out.print("Masukkan Angka : ");
            }
            scanner.next();
            boolean isSearch = true;
            while (isSearch) {
                System.out.print("Masukkan Angka Yang Ingin Dicari : ");
                int intSearch = scanner.nextInt();
                int intIndex = searchIndex(intNumber, intCount, intSearch);
                if (intIndex == -1) {
                    System.out.print("Angka " + intSearch + " Tidak Ditemukan Pada Data Hasil Inputan Sebelummnya.");
                } else {
                    System.out.print("Angka Yang Anda Input Adalah : ");
                    for (int i = 0; i < intCount; i++) {
                        System.out.print(intNumber[i]);
                        if (i < intCount - 1) {
                            System.out.print(",");
                        }
                    }
                    System.out.println();
                    System.out.println("Angka Yang Dicari Adalah : " + intSearch);
                    System.out.println("Angka " + intSearch + " Ditemukan Pada Index Ke - " + intIndex + " Urutan Ke - " + (intIndex + 1) + " Dari Data Yang Diinput.");
                }
                System.out.print("Ingin Mencari Lagi?(Y/N)");
                String strRepeat = scanner.next();
                if (!strRepeat.equalsIgnoreCase("y")) {
                    isSearch = false;
                }
            }
            System.out.println("Ingin Mengulangi Programm?(Y/N)");
            String strRepeatA = scanner.next();
            if (!strRepeatA.equalsIgnoreCase("y")) {
                isRepeat = false;
                System.out.println("Terimakasih Telah Menggunakan Programm Searching Linear.");
            }
        }
    }


    private static int searchIndex(int[] intNumber, int intCount, int intSearch) {
        for (int i = 0; i < intCount; i++) {
            if (intNumber[i] == intSearch) {
                return i;
            }
        }
        return -1;
    }
}
