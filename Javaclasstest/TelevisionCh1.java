package Javaclasstest;

public class TelevisionCh1 {
    private int channel;
    private int volume;
    private boolean isOn;

    TelevisionCh1(int c , int v , boolean o ){
        channel = c;
        volume = v;
        isOn = o;
    }

    public void print() {
        System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다");
    }
    public static void main(String[] args) {
        TelevisionCh1 myTv = new TelevisionCh1(7, 10, true);
        myTv.print();

        TelevisionCh1 yourTv = new TelevisionCh1(11, 20 , true);
        yourTv.print();
    }    
}
