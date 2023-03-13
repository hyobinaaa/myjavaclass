// 메소드에서 객체 반환하기


package Javaclasstest;


 class Box{
    int width , length , height;
    int volume ;

    Box(int w , int l , int h){
        width = w;
        length = l;
        height = h;
        volume = w * l * h;

    }
    Box whosLargest(Box box1 , Box box2){
        if(box1.volume > box2.volume){
            return box1;
        }
        else{
            return box2;
        }    
        
    }
}


public class BoxTest {
    public static void main(String[] args) {
        Box obj1 = new Box(10 , 20 , 50);
        Box obj2 = new Box(10 , 30 , 30);

        Box largest = obj1.whosLargest(obj1 , obj2);
        System.out.println("("+ largest.width + "," + largest.length + "," + largest.height + ")");
    }
    
}
