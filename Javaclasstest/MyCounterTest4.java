package Javaclasstest;

class MyCounter{
    int value = 0;
    void inc (MyCounter ctr){
        ctr.value = ctr.value + 1;
    }
}


public class MyCounterTest4 {
    public static void main(String[] args) {
        MyCounter obj = new MyCounter();

        System.out.println("obj.value =" +obj.value );
        obj.inc(obj);
        System.out.println("obj.value = " + obj.value);
    }    
}
