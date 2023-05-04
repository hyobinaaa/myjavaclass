package Interface;


interface Drivable{
    void drive();
}

interface Flyable{
    void fly();
}

public class FlyingCar  {
    
    public void drive(){
        System.out.println("I'm driving");
    }

    public void fly(){
        System.out.println("I'm flying");
    }

    public static void main(String[] args) {
        FlyingCar obj = new FlyingCar();
        obj.drive();
        obj.fly();
    }
}
