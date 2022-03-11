package com.company;

    public class bangundatar {
        void HitungLuasPersegi(int sisi){

            //Rumus Luas Persegi = sisi * sisi

            int luas = sisi * sisi;

            System.out.print("Persegi : "+ luas + "\n");

        }
        void HitungLuasSegitiga(int alas,int tinggi){

            //Rumus Luas Segitiga = 1/2 * (alas * tinggi)

            double luas = 0.5 * (alas * tinggi);

            System.out.print("Segitiga : "+ luas +"\n");

        }
        void HitungLuasPersegiPanjang(int panjang, int lebar){

            //Rumus Luas Persegi Panjang = panjang * lebar

            int luas = panjang * lebar;

            System.out.print("Persegi Panjang : "+ luas +"\n");

        }
        void HitungKelilingPersegi(int s){
            int keliling = 4*s;
            System.out.print("Persegi : "+ keliling + "\n");
        }
        void HitungKelilingSegitiga(int t){
            int keliling = 3*t;
            System.out.print("Segitiga : "+ keliling + "\n");
        }
        void HitungKelilingPersegiPanjang(int p,int l){
            int keliling = 2*(p+l);
            System.out.print("Persegi Panjang : "+ keliling + "\n");
        }




        public static void main(String[] args) {
            bangundatar luas = new bangundatar();
            System.out.println("Luas");
            luas.HitungLuasPersegi(4);
            luas.HitungLuasSegitiga(3,4);
            luas.HitungLuasPersegiPanjang(7,8);
            bangundatar keliling = new bangundatar();
            System.out.println("Keliling");
            keliling.HitungKelilingPersegi(4);
            keliling.HitungKelilingSegitiga(4);
            keliling.HitungKelilingPersegiPanjang(7,8);

        }
    }


