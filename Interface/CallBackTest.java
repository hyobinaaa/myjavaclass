package Interface;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class Myclass implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event){
        System.out.println("beep");
    }
}



public class CallBackTest {
    public static void main(String[] args) {
        
        ActionListener lisnter = new Myclass();
        Timer t = new Timer(1000, lisnter);
        t.start();
        for(int i = 0; i < 1000 ; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}
