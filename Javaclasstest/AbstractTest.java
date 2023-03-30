package Javaclasstest;

abstract class Shape{
    private int x;
    private int y;

    public void move(int x, int y){
        this.x = x;
        this.y= y;
    }

    public abstract void draw();
}

class Circle extends Shape{
    private int radius;
    public void draw(){
        System.out.println("원 그리기 메소드");
    }
}

class Reactangle extends Shape{
    private int width , heigth;

    @Override
    public void draw(){
        System.out.println("사각형 그리기 메소드");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Ractangle rectangle = new Ractangle();
        rectangle.draw();

        Circle circle = new Circle();
        circle.draw();
    }
    
}
