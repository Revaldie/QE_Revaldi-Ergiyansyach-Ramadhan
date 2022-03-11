package com.company;

public class volume {
    void HitungVolumeKubus(int sisi){

        double volume = Math.pow(sisi,3);

        System.out.print("Kubus : "+ volume + "\n");

    }
    void HitungVolumeBalok(int panjang,int lebar, int tinggi){

        double volume = panjang * lebar * tinggi;

        System.out.print("Balok : "+ volume +"\n");

    }
    void HitungVolumeTabung(int jari_jari, int t){

        //Rumus Luas Persegi Panjang = panjang * lebar
        double phi = 3.14;
        double volume = phi*Math.pow(jari_jari,2)*t;

        System.out.print("Tabung: "+ volume +"\n");

    }
    public static void main(String[] args) {
        volume bangunruang = new volume();
        bangunruang.HitungVolumeKubus(10);
        bangunruang.HitungVolumeBalok(3,6,10);
        bangunruang.HitungVolumeTabung(7,10);
    }
}


