package com.juaracoding.iwjavafundamental.testharian.praktikum_3;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Iqbal Wibisono  a.k.a Iqbal Wibisono
Java Developer
Created on 23/01/2023 18:35
@Last Modified 23/01/2023 18:35
Version 1.1
*/

import java.util.Scanner;


/* soal nomor 1 praktikum 3

 */

public class Praktikum3 {

        public static void main(String[] args) {

                int intInput, intDetik = 0, intMenit = 0;

                Scanner sc = new Scanner(System.in);
                System.out.print("Masukkan Jumlah Detik : ");
                intInput = sc.nextInt();

                if (intInput<=60){
                        intDetik = intInput%60;
                }

                else if (intInput>=60) {
                        intDetik = intInput % 60;
                        intMenit = intInput / 60;

                }
                System.out.print(intInput+" Detik Sama Dengan "+intMenit+" Menit "+intDetik+" Detik");

        }
        }
