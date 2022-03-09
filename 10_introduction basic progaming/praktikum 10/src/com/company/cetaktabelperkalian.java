package com.company;

public class cetaktabelperkalian {

    public static void main(String[] args) {

        System.out.println("\t\t tabel perkalian 1 - 9 \n");

        for (int a = 1; a <= 9; a++) {

            for(int y = 1; y <= 9; y++){

                System.out.print("" + a * y + "\t");
            }
            System.out.print("\n\n");
        }
    }
}