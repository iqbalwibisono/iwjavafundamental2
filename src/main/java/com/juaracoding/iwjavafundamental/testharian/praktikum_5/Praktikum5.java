package com.juaracoding.iwjavafundamental.testharian.praktikum_5;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Iqbal Wibisono  a.k.a Iqbal Wibisono
Java Developer
Created on 07/02/2023 11:24
@Last Modified 07/02/2023 11:24
Version 1.1
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum5 {

    /* Soal Praktikum 5 Nomor 3

     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan= new Scanner(System.in);

        System.out.print("Masukkan angka sepuasnya ");
        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
        }

        System.out.println("1. Cari Nilai Terbesar");
        System.out.println("2. Cari nilai terkecil");
        System.out.println("3. Hitung Rata-rata");
        System.out.print("Pilih Proses (1-3): ");


        Scanner sc= new Scanner(System.in);

        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Nilai Terbesar dari " + numbers + " adalah " + findMax(numbers));
        } else if (choice == 2) {
            System.out.println("Nilai Terkecil dari " + numbers + " adalah " + findMin(numbers));
        } else if (choice == 3) {
            System.out.println("Nilai Rata-Rata dari " + numbers + " adalah " + findAverage(numbers));
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }

    public static int findMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double findAverage(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {

            sum += number;
        }
        return (double) sum / numbers.size();
    }

    }



