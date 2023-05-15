package Lambda;


@FunctionalInterface
interface MyInterface{
    void sayHello();
}


public class LambdaTest1 {
    public static void main(String[] args) {
    
    MyInterface hello = () -> System.out.println("Hello Lambda!");
    hello.sayHello();
}    
}
