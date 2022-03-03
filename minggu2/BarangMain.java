package minggu2;
public class BarangMain {
    public static void main(String[] args){
        Barang b1 = new Barang();
        b1.namaBarang = "Corsair 2gb";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 25000;
        b1.stok = 0;
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        Barang b2 = new Barang("Logitech", "Wireless Mouse", 25, 150000);
        b2.tampilBarang();
    }
}
