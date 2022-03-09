package com.company;

public class mean{
 public static void main(String[] args){
     int[] angka ={1, 2, 3, 4};
     float mean = 0;

     for (int x = 0; x < angka.length; x++){
         mean += angka[x];

     }
     mean= mean/angka.length;
     System.out.println("mean: "+mean);
 }
}