package InterfaceTest;

import Interface.RemoteControl;

public class SamsungTV implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("삼성 티비를 켭니다");
    }

    @Override
    public void turnOff() {
       System.out.println("삼성 티비를 끕니다.");
    
    }

    
}
