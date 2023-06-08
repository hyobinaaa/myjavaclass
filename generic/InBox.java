package generic;

public class InBox {
    // 기초자료형 int의 wrapper class
    private Object value;

    public Object gerValue(){
        // value = 3; 
        // int v= value; 
        return value;
    }
    
    public void setValue(Object value){
        this.value = value;
    }
}
