package ObjectClass;

public class Car {
    String brand;
    String model;

    


    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public Car(){
      this("Unknown" , "Unkown");
    }

    @Override
    public boolean equals(Object obj){ 
       Car objCar = (Car) obj;
       // obj는 car 클래스의 객체라 가정한다
       // 그래야, Car 클래스의 인스턴스의 brand , model 맴버에 접근할 수 있다
       // 하향 형변환
       
       if( (this.brand).equals(objCar.brand) && (this.model).equals(objCar.model)){
         
        return true;
       }
     return false;
    }
    
    
}
