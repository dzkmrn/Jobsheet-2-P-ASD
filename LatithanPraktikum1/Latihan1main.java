package LatithanPraktikum1;

import java.util.Scanner;
public class Latihan1main {
    public static void main(String[] args) {
        Latihan1 p1 = new Latihan1();
        Scanner kipe = new Scanner(System.in);
        p1.nama="Permen";
        p1.hargaSatuan=5000;
        
        System.out.println(p1.nama);
        System.out.println("Harga : "+p1.hargaSatuan);
        System.out.println(" ");
        
        System.out.print("Jumlah pesanan anda : ");
        int beli = kipe.nextInt();
        p1.jumlah = beli;

        p1.hitungHargaTotal();
        p1.hitungDiskon();
        p1.hitungHargaBayar();

        if(p1.hitungDiskon()<=50000){
            System.out.println("Diskon yang didapatkan : "+p1.hitungDiskon());
            System.out.println(("Total harga (setelah dipotong diskon) : ")+ p1.hitungHargaBayar());
        }else{
            System.out.println("Maaf, anda tidak mendapatkan diskon");
            System.out.println(("Total harga : ")+ p1.hitungHargaBayar());
        }
    }
}
