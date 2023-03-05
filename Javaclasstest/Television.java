package Javaclasstest;

public class Television {
    int channel;
    int volume;
    boolean onOff;

    void print() {
        System.out.println("채널은" + channel + "이고 볼륨은 " + volume + "입니다");
    }

    // 채널 변수값 반환
    int getChannel() {
        return channel; 
    }
}