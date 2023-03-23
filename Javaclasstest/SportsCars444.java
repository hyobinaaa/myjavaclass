package Javaclasstest;



class Car {
    private int speed;

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}


class SportsCars extends Car{
    private boolean turbo;

    public boolean isTurbo(){
        return turbo;
    }
    
    public void setTurbo(boolean turbo){
        this.turbo = turbo;
    }

    
}

public class SportsCars444 {
    public static void main(String[] args) {
        SportsCars sc = new SportsCars();
        sc.setSpeed(150);
        sc.setTurbo(true);
        
        System.out.println("speed[" +sc.getSpeed()+"] , turbo["+sc.isTurbo() + "]");
    }
    
}
