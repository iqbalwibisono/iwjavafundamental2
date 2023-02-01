package com.juaracoding.iwjavafundamental.cobacoba;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Iqbal Wibisono  a.k.a Iqbal Wibisono
Java Developer
Created on 14/01/2023 20:01
@Last Modified 14/01/2023 20:01
Version 1.1
*/

import java.util.Scanner;
public class Praktikum1 {

    //soal nomor 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Masukkan Kata :");
        String strInput = sc.nextLine();
        char chJob;
        int intJob;
        int intJumlah = 0;
        for (int i = 0; i < strInput.length(); i++) {
            chJob = strInput.charAt(i);
            intJob = chJob;
            if ((intJob >= 65 && intJob <= 97) || (intJob >= 48 && intJob <= 57) || (intJob >= 32 && intJob <= 47) || intJob >= 58 && intJob <= 64) {
                intJumlah = intJumlah + intJob;


            }
            System.out.println("Number ASCII : " + strInput.charAt(i) + " -> " + intJob);

        }
            System.out.println("Jumlah Ke : " + intJumlah);

        //soal nomor 2

        System.out.printf("Masukkan Kata :");
        String strInput3 = sc.nextLine();
        char chZ;
        int intZ = 0;
        int intJumlah3 = 0;
        for (int i = 0; i < strInput3.length();i++)
        {
            chZ = strInput3.charAt(i);
            intZ = chZ;
            if ((intZ>=65 && intZ<=90) || (intZ>=48 && intZ<=57) || (intZ>=32 && intZ<=47)
                    || (intZ>=58 && intZ<=64))
            {
                intJumlah3 = intJumlah3 + intZ;


            }
            System.out.println("Number ASCII : " + strInput3.charAt(i) + " -> " + intZ);

        }
        System.out.println("Jumlah Ke : " + intJumlah3);

        //soal nomor 3

        System.out.printf("Masukkan Kata :");
        String strInput4 = sc.nextLine();
        char chLo;
        int intLo = 0;
        int intJumlah4 = 0;
        for (int i = 0; i < strInput4.length(); i++)
        {
            chLo = strInput4.charAt(i);
            intLo = chLo;
            if ((intLo >= 32 && intLo <= 122))
            {
                intJumlah4 = intJumlah4 + intLo;

            }

                System.out.println("Number ASCII : " + strInput4.charAt(i) + " -> " + intLo);
            }
        System.out.println("Jumlah Ke : " + intJumlah4);


        }


    }