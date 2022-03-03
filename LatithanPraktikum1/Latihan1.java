package LatithanPraktikum1;

public class Latihan1 {
    String nama;
    int hargaSatuan, jumlah;


    int hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }
    
    int hitungDiskon(){
        int diskon = 0;
        if(hitungHargaTotal()>100000){
            diskon = hitungHargaTotal()*10/100;
        }else if(hitungHargaTotal()>50000&&hitungHargaTotal()<=100000){
            diskon = hitungHargaTotal()*5/100;
        }else{
        
        }
        return diskon;
    }

    int hitungHargaBayar(){
        return hitungHargaTotal()-hitungDiskon();
    }
}
