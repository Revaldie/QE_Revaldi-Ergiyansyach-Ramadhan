package com.company;
public class ongkoskirim {
    void hitungongkoskirim(int p, int l,int t,int berat){
        int ongkos;
        int volume;
        volume = p*l*t;
        ongkos = ((volume/50)+1) * berat * 5000;
        System.out.println("Harga : Rp. " + ongkos);
    }
    public static void main(String[] args){
        ongkoskirim ok = new ongkoskirim();
        ok.hitungongkoskirim(5,2,4,1);

    }
}
