// 메소드로 기초형 변수가 전달되는 경우

package Javaclasstest;

public class MyCounterTest1 {
    public static void main(String[] args) {
        MyCounter obj  = new MyCounter();
       System.out.println("obj.value = " + obj.value);
       obj.inc(obj);
       System.out.println("obj.value = " + obj.value);
        
    }
    
}
