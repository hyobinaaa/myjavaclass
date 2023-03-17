package Javaclasstest;

public class Cars {
    int speed;
    Cars(){
        System.out.println("속도는 " + speed);

    }
    {
        speed = 100; // Copy (생성자가 여러개일때도)
    }
    public static void main(String[] args) {
        Cars c1 = new Cars();
        Cars c2 = new Cars();
    }
    
}
