package Javaclasstest;

public class Reactangle {
    private int x,y;
    private int width,heigth;

    Reactangle(){
        this(0 , 0 ,1 ,1);
    }

    Reactangle(int width, int heigth){
        this(0,0,width,heigth);
    }
    Reactangle(int x, int y ,int width ,int heigth){

        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
    }
    
}
