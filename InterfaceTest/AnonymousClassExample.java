package InterfaceTest;

public class AnonymousClassExample {
    public static void main(String[] args) {

        // Runnable 인터페이스를 구현한 무명 클래스를 생성하여 객체를 생성한다
        Runnable runnable = new Runnable() {
            @Override
                public void run(){
                    System.out.println("Hello, World!");
                }
        };

        // 생성한 객체를 실행합니다
        runnable.run();
    }
    
}
