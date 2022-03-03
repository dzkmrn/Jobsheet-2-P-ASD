package LatihanPraktikum2;

public class Latihan2 {
    int x, y, width, height;

    void moveLeft(){
        if(x<0&&x<width);
        x-=1;
    }
    void moveRight(){
        if(x>0&&x<width);
        x+=1;
    }
    void moveUp(){
        if(y>0&&y<height);
        y+=1;
    }
    void moveDown(){
        if(y<0&&y<height);
        y-=1;
    }
    void printPosition(){
        System.out.print("Koordinat "+x+" dan "+y);
    }
}
