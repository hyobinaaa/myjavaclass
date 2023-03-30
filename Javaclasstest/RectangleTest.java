package Javaclasstest;

class Shape{
    public Shape(String msg){
        System.out.println("Shape 생성자()" + msg);
    }
}

public class RectangleTest extends Shape {
    public RectangleTest() {
        super("from RectangleTest");
        System.out.println("RectanglTest 생성자()");
    }
    public static void main(String[] args) {
        RactangleTest rt = new RactangleTest();
    }
}
