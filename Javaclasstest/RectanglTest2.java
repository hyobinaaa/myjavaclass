package Javaclasstest;

class Shape{
    public Shape(String msg){
        System.out.println("Shape 생성자(msg)" + msg);
    }

    public Shape(){
        System.out.println("Shape 생성자()");
    }
}

public class RectanglTest2 extends Shape{
    public RectanglTest2(){
        System.out.println("Rectangle 생성자()");
    }

    public static void main(String[] args) {
        RectanglTest2 rt = new RectanglTest2();
    }
    
}
