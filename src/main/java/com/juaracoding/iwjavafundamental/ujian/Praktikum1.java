package com.juaracoding.iwjavafundamental.ujian;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Masukkan Kata :");
        String strInput = sc.nextLine();
        char chX;
        int intX;
        int intJumlah =0;
        for (int i=0;i<strInput.length();i++)
        {
            chX =strInput.charAt(i);
            intX = chX;
            if((intX>=65 && intX<=97) || (intX>=97 && intX<=122) || (intX>=48 && intX<=57) || (intX>=32 && intX<=47))
            {
                intJumlah=intJumlah+intX;


            }
            System.out.println("Number ASCII : "+strInput.charAt(i)+" -> "+intX);
            System.out.println("Jumlah Ke : "+intJumlah);

        }

    }
}
