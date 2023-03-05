package Javaclasstest;
public class Televsion1 {
    public static void main(String[] args) {

        Television myTv = new Television(); // 객체 생성
        
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;

        int ch = myTv.getChannel(); // ch 에 Television클래스에 멤버 변수값 받기
        System.out.println("현재 채널은" + ch + "입니다"); // 채널 출력
    }
}