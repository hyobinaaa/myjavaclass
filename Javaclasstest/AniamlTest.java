package Javaclasstest;

class Aniaml{
    private double weight;
    private String picture;

    protected void eet(){
        System.out.println("eat()가 호출되었음");

    }

    void sleep(){
        System.out.println("sleep()가 호출되었음");
    }

    public double getWeigh(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getPicture(){
        return picture;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }
}

class Lion extends Aniaml{
    private int legs = 4;

    public int getLegs(){
        return legs;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public void roar(){
        System.out.println("roar() 호출되었음");
    }
}

class Eagle extends Animal{
    private int wings = 2;

    public int getWings(){
        return wings;
    }

    public void setWeight(int wings){
        this.wings = wings;
    }

    public void fly(){
        System.out.println("fly()가 호출되었음");
    }
}

public class AniamlTest {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eet();
        lion.sleep();
        lion.roar();
        System.out.println("\n------------------\n");
        Eagel eagel = new Eagel();
        eagel.eat();
        eagel.sleep();
        eagel.sleep();
    }
    
}
