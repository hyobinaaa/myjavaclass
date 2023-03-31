package Javaclasstest;
class Shape{
    protected int x ,y;

}

class Ractangle extends Shape{
    private int width, heigth;
}

class Triangle extends Shape{
    private int base , heigth;
}

class Circle extends Shape{
    private int radius;
}


public class ShapeTest {
    public static void main(String[] args) {
        Shape s = new Ractangle();
        Ractangle r = new Ractangle();
        
        s.x = 0;
        s.y = 0;
    }
    
}
