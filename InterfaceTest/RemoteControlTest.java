package InterfaceTest;

import Interface.RemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl rm = new SamsungTV();
        rm.turnOn();
        rm.volumControl(3);

        rm = new LgTv();
        rm.turnOn();
        rm.volumControl(-2);
    }
    
}
