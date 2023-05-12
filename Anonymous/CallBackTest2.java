package Anonymous;

import Interface.RemoteControl;

public class CallBackTest2 {
    public void remoteControl(RemoteControl rc){
        rc.turnOn();
    }

    public static void main(String[] args) {
        CallBackTest2 cb = new CallBackTest2();

        // 무명 클래스로 RemoteControl 객체를 인자로 전달하시오
        // 1. 변수 사용해서 전달해보고 
        // 2. 변수 사용하지 않고 전달해보고.
        // 화면에는 파나소닉 테레비가 켜졌습니다
        cb.remoteControl(null);
    }
    
}
