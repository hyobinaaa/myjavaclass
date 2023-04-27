package InterfaceTest;

import Interface.RemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl rm = new SamsungTV();
        rm.turnOn();

        rm = new LgTv();
        rm.turnOn();
    }
    
}
