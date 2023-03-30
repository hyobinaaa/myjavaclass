package Javaclasstest;

class Aniaml{
    private double weight;
    private String picture;

    protected void eat(){
        System.out.println("동물이 묵고 있습니다.");
    }

    void sleep(){
        System.out.println("sleep() 가 호출되었음");
    }

    public double getWeight(){
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

class Dog extends Aniaml{

    public void eat(){
        System.out.println("강아지가 먹고 있습니다.");
    }
}




public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        
    }
    
}
