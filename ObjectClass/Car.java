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
       
       if( (this.brand).equals(objCar.brand) && (this.model).equals(objCar.model))
            return true;
        return false;
    }
    
    
}
