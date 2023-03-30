package Javaclasstest;
class Shape{
    private int x;
    private int y;

    public Shape(int x , int y){
        System.out.println("Shape()");
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    public void print(){
        System.out.println("X좌표:" + x + "Y좌표:" + y);
    }
}

class Rectangle extends Shape{
    private int width;
    private int heigth;

    public Rectangle(int x ,int y , int width , int heigth) {
        super(x,y);
        System.out.println("Rectangle()");
        this.width = width;
        this.heigth = heigth;
    }
    
}


public class ColorRectangle extends Reactangle {
    private String color;
    public ColorRectangle( int x, int y, int width ,int heigth , String color){
        

        System.out.println("ColorRectangle()");

        this.color = color;
    }
    public static void main(String[] args) {
        ColorRectangle obj = new ColorRectangle(10, 10, 20, 20, "red");
        
    }
     
}

