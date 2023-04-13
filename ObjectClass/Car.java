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
       // obj가 Car 클래스의 인스턴스가 아니면 바로 false를 반환하자.
       // 자바에는 이 목적으로 사용할 수 있는 연산자(+, -, * / , %,...) 가 있다
       // instanceof 가 있다.
       // 연산자 사용 예 : 3+4 0 , +(3,4) X

      
       // obj는 car 클래스의 객체라 가정한다
       // 그래야, Car 클래스의 인스턴스의 brand , model 맴버에 접근할 수 있다
       // 하향 형변환
       
       if( (this.brand).equals(objCar.brand) && (this.model).equals(objCar.model)){
         
        return true;
       }
     return false;
    }
    
    
}
