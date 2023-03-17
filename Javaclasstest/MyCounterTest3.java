package Javaclasstest;

class MyCounter{
    int value;
    void inc(int a){
        a = a + 1;
    }
}

public class MyCounterTest3 {
    public static void main(String[] args) {
        MyCounter obj = new MyCounter();
        int x = 10;
        obj.inc(x);
        System.out.println(" x = " + x);
    }
}
