package Anonymous;

import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;






class Myclass implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event){
        System.out.println("beep");
    }
}



public class CallBackTest {
    public static void main(String[] args) {
        
        ActionListener lisnter = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("beep");
            }

        };
        Timer t = new Timer(1000, lisnter);
        t.start();

        // Beep from 무명클래스

        Scanner input = new Scanner(System.in);
        System.out.println("Press Enter to quit");
        input.nextLine();
        input.close();
        System.out.println("프로그램을 종료합니다~~!!");
        for(int i = 0; i < 1000 ; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}
