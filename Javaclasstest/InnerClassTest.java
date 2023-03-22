package Javaclasstest;

class OuterClass{
    private int value = 10;

    class InnerClass{
        public void myMethod(){
            System.out.println("외부 클래스의 private 변수 값:" + value);
        }
    }

    OuterClass(){
        InnerClass obj = new InnerClass();
        obj.myMethod();
    }
}



public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
    }
    
}
