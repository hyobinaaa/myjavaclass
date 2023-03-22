package Javaclasstest;

class Shape{
    private int x;
    private int y;

    public int getX(){return x;}
    public void setX(int x){this.x = x;}
    public int getY(){return y;}
    public void setY(int y){this.y = y;}

    void print() {
        System.out.println("x좌표: " + x + " y좌표: " + y);
    }

}

class Ractangle extends Shape{
    private int width;
    private int height;

    public int getWidth(){return width;}
    public void setWidth(int width) { this.width = width;}
    public int getHeight(){return height;}
    public void setHeight(){this.height = height;}

    double area(){
        return (double) width + height;
    }

    void draw(){
        System.out.println("(" + this.getX() + "," + this.getY() + ") 위치에" + "가로:" + width + "세로:" + height);
    }

}
public class RactangleTest {
    public static void main(String[] args) {
        Ractangle r1 = new Ractangle();
        Ractangle r2 = new Ractangle();

        // 부모의 메소드를 클래스로 사용할수있다
        r1.setX(5);
        r1.setY(3);
        r1.setWidth(10);
        r1.setHeight();
        

        r2.setX(8);
        r2.setY(9);
        r2.setWidth(10);
        r2.setHeight();

        r1.print();
        r1.draw();
        r2.print();
        r2.draw();


        
    }
}
