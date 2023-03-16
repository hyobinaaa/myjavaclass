package Javaclasstest;

public class Box {
    private int width;
    private int length;
    private int heigth;
    private int volume;

    public int getVolume(){
        volume = width * length * heigth;
        return volume;
    }

    Box (int w , int l , int h){
        width = w;
        length = l;
        heigth = h;
    }

    public static void main(String[] args) {
        Box box = new Box(20, 20, 30);

        System.out.println("상자의 부피는" + box.getVolume() + "입니다.");
    }
}
