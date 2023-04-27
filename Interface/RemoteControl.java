package Interface;

public interface RemoteControl {
    public void turnOn(); // 가전제품을 켠다
    public void turnOff(); // 가전제품을 끊다

    default void volumControl(int amount){
        String st = null;
        st = amount > 0 ? "높입니다." : "줄입니다";
        amount = Math.abs(amount); // |number|
        System.out.println("볼륨을" + amount + "만큼" + st);
    }
     
     
}
