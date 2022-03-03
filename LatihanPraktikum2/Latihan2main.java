package LatihanPraktikum2;

public class Latihan2main {
    public static void main(String[] args) {
        Latihan2 koor = new Latihan2();
        koor.x=0;
        koor.y=0;
        koor.width=20;
        koor.height=20;
        koor.moveUp();
        koor.moveDown();
        koor.moveLeft();
        koor.moveRight();

        System.out.println("\nPROGRAM PACMAN");
        System.out.println("Titik awal koordinat saat ini : ");
        koor.printPosition();
        System.out.println("\nLalu bergerak kekiri 2x menjadi ");
        koor.moveLeft();
        koor.moveLeft();
        koor.printPosition();
        System.out.println("\nKemudian bergerak keatas menjadi ");
        koor.moveUp();
        koor.printPosition();
        System.out.println("\nSetelah itu bergerak kekanan menjadi ");
        koor.moveRight();
        koor.printPosition();
        System.out.println("\nTujuan terakhir pacman berada setelah turun kebawah 1x, yaitu ");
        koor.moveDown();
        koor.printPosition();
    }
}
