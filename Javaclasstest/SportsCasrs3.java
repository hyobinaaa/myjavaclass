package Javaclasstest;

public class SportsCasrs3 {
    public static void main(String[] args) {
        SportsCars2 obj = new SportsCars2(); // 자식 클래스 객체 생성

        // 부모 클래스 필드와 메소드 사용
        obj.speed = 10;
        obj.setSpeed(60);
        obj.setTurbo(true); // 자체 메소드 사용

        
    }
    
}
