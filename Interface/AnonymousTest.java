package Interface;

import InterfaceTest.LgTv;
import InterfaceTest.SamsungTV;

public class AnonymousTest {
    public static void main(String[] args) {
        RemoteControl rt1 = new SamsungTV();
        rt1.turnOff();

        RemoteControl rt2 =new LgTv();
        rt2.turnOn();

        // 무명 클래스로 SONY TV 객체를 만들어 보자.

        RemoteControl rt3 = new RemoteControl() {
            
            @Override
            public void turnOn(){
                System.out.println("Sony Tv를 켭니다.");
            }

            @Override
            public void turnOff(){
                System.out.println("Sony Tv를 끕니다.");
            }
        };
        rt3.turnOn();
    }


    

    
}
