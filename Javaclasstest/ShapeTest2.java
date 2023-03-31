package Javaclasstest;

class Shape {
    private int x;
    private int y;

    public void drwa(){
        System.out.println("Shape Draw["+ x + " ," + y +"]");
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
}

class rectangle extends Shape{
    private int width;
    private int heigth;

    
    public void draw(){
        System.out.println("Rectangle Draw["+width+"," + heigth+ "]");
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return heigth;
    }

    public void setHeight(int heigth){
        this.heigth = heigth;
    }
}

class Triangle extends Shape{
    private int width;
    private int heigth;

    
    public void draw(){
        System.out.println("Triangle Draw["+width+" , "+heigth+"]");
    }
    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return heigth;
    }

    public void setHeight (int heigth){
        this.heigth = heigth;
    }
}

class Circle extends Shape {
    private int radius;

    public void draw(){
        System.out.println("Circle Draw["+radius+"]");
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;   
    }
}

public class ShapeTest2 {
    public static void main(String[] args) {
        Shape s1, s2, s3, s4;

        s1 = new Shape();
        s2 = new rectangle();
        s3 = new Triangle();
        s4 = new Circle();


        s1.drwa();
        s2.drwa();
        s3.drwa();
        s4.drwa();

    }
}
