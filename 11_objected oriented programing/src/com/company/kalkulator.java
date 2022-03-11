package com.company;
public class kalkulator{
    int hasil=0;
    //Fungsi Penjumlahan a + b
    void Penjumlahan (int a,int b){
        hasil=a+b;
        System.out.println("Pertambahan : "+hasil);
    }
    //Fungsi Pengurangan a + b
    void Pengurangan (int a,int b){
        hasil=a-b;
        System.out.println("Pengurangan :"+hasil);
    }
    //Fungsi Perkalian a + b
    void Perkalian (int a,int b){
        hasil=a*b;
        System.out.println("Perkalian   : "+hasil);
    }
    //Fungsi Pembagian a + b
    void Pembagian (int a,int b){
        hasil=a/b;
        System.out.println("Pembagian   : "+hasil);
    }
    public static void main (String args[]){
        kalkulator mat = new kalkulator();
        mat.Penjumlahan(3,4);
        mat.Pengurangan(15,4);
        mat.Perkalian(10,10);
        mat.Pembagian(12,3);
    }
}