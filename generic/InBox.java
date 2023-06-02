package generic;

public class InBox {
    // 기초자료형 int의 wrapper class
    private Integer value;

    public Integer gerValue(){
        // value = 3; 
        // int v= value; 
        return value;
    }
    
    public void setValue(Integer value){
        this.value = value;
    }
}
