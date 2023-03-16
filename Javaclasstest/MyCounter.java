// 메소드로 객체가 전달되는 경우

package Javaclasstest;

public class MyCounter {
    private int counter;

    MyCounter(){
        counter = 1;
    }

    public void increase(){
        counter++;

    }

    public int getCounter(){
        return counter;
    }
    
    public static void main(String[] args) {
        MyCounter cntobj1 = new MyCounter();
        MyCounter cntobj2 = new MyCounter();

        cntobj2.increase();

        System.out.println("cntobj1의 counter" + cntobj1.getCounter());
        System.out.println("cntobj2의 counter" + cntobj2.getCounter());
    }
}
