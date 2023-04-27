package InterfaceTest;

import Interface.RemoteControl;

public class SamsungTV implements AdvencedRemoteControl {

    @Override
    public void turnOn() {
        System.out.println("삼성 티비를 켭니다");
    }

    @Override
    public void turnOff() {
       System.out.println("삼성 티비를 끕니다.");
    
    }

    @Override
    public void volumControl(int amount) {
         
        String st = null;
        st = amount > 0 ? "높입니다." : "줄입니다";
         amount = Math.abs(amount); // |number|
        System.out.println("삼성티비를" + amount + "만큼" + st);
     }
    }

    

