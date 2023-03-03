package Javaclasstest;

class Television{ // 텔레비젼 이라는 객체
    int channel; // 채널번호
    int voulume; // 볼륨
    boolean isOn; // 전원 상태

    void print(){
        System.out.println("채널은" + channel + "이고 볼륨은" + voulume + "입니다");
    }
}


public class TelevisionTest {
    public static void main(String[] args) {

        Television myTV = new Television();

        myTV.channel = 7;
        myTV.voulume = 9;
        myTV.isOn = true;
        myTV.print();


        Television yourTV = new Television();
        yourTV.channel = 9;
        yourTV.voulume =12;
        yourTV.isOn = true;//
        yourTV.print();
        
    }
}
