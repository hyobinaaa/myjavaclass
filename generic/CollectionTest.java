package generic;

import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("4번 김지훈");
        names.add("김현");
        names.add("이재일");
        names.add("석진석");
        names.add("조현준");
        names.add("김일권");

        for(String name: names){
            System.out.println(name); 
        }
    }
    
}
