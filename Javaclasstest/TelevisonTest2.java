package Javaclasstest;


public class TelevisonTest2 {
    public static void main(String[] args) {
        Television tv = new Television(); // 객체를 생성

        // 객체의 멤버에 접근할때는 멤버 연산자(.)를 사용한다.
        tv.channel = 7; 
        tv.voulume = 9;
        tv.isOn = true; 
        System.out.println("텔레비전의 채널은" + tv.channel + "이고 볼륨은" + tv.voulume + "입니다.") ;        
    }
    
    
}
