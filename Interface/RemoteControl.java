package Interface;

public interface RemoteControl {
    public void turnOn(); // 가전제품을 켠다
    public void turnOff(); // 가전제품을 끊다

    default void volumControl(int amount){};
     
}
