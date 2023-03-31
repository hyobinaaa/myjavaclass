package Javaclasstest;

class Point {
    private int x;
    private int y;

    public Point (int x ,int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point [x= " +x +", y = "+y +"]";
    }
}

class Circle{
    private int radius;
    private Point center;

    public Circle(Point p , int r){
        center = p;
        radius = r;

    }
    public String toString(){
        return "Circle [radius = " + radius + " , center ="+ center +" ]";
    }
}


public class CircleTest {
    public static void main(String[] args) {
        Point p = new Point(25, 78);

        Circle c = new Circle(p, 10);

        System.out.println(c);
        
    }
    
}
