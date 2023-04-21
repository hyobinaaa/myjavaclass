package InterfaceTest;

public class Car implements Comparable{
    private String brand;
    private String model;
    private int price;
    private int speed;
    
    public Car(){

    }

    public Car(String brand, String model, int price, int speed) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.speed = speed;

        
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

  

    @Override
    public int compareTo(Comparable obj) {
      // 차의 가격 비교를 하려면, Car 클래스의
      // getPrice 메소드를 호출해기위해, 부득이
      // Comparable 타입으로 받은 인자를
      // Car 타입으로 하향 형변환.
      // 물론 이 obj 객체는 Car클래스의 타입이 객체이어야만하고
      // 그러하다고 가정
     
      Car c = (Car) obj;
      // 내차 가격과 인자로 전달된 차의 가격 비교
      if (price > c.getPrice()) {
        return 1;
      }
      if (price == c.getPrice()) {
        return 0;
      }
      return -1;
    }

    @Override
    public String toString() {
        
        return (
            "[브랜드 : " + brand + "모델 : " + model + "speed : " + speed + "price : " + price +"]"
        );
        
    }
}
