// 메소드로 기초형 변수가 전달되는 경우

package Javaclasstest;

public class MyCounterTest1 {
    private int counter; 

    MyCounterTest1(){
        counter = 1;
    }
    MyCounterTest1(int value){
        counter = value;
    }

    public void increase() {
        counter++;
    }

    public int getCounter(){
        return counter;
    }
    public static void main(String[] args) {
        MyCounterTest1 cntobj1 = new MyCounterTest1(100);
        MyCounterTest1 cntobj2 = new MyCounterTest1(200);

        System.out.println("cntobj1 의 counter:" + cntobj1.getCounter());
        System.out.println("cntobj2 의 counter:" + cntobj2.getCounter());
    }
        
    }
    

