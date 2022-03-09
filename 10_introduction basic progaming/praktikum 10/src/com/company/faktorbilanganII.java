package com.company;

import java.util.Scanner;

public class faktorbilanganII {



    public static void main(String[] args)
    {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka faktornya : ");
        bilangan = input.nextInt();
        System.out.print("Faktor dari " + bilangan + " adalah : ");
        for(int i=6;i>=1;i--)
        {
            if(bilangan%i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}