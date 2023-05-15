package Lambda;

import javax.swing.Timer;

public class CallBackTest {

    public static void main(String[] args) {
    Timer t = new Timer(1000, event -> System.out.println("beep"));
    t.start();


        for(int i = 0; i < 1000; i++){
            try{
                    Thread.sleep(1000);
            }catch (InterruptedException e) {
            }
    }
    }
    
}
