package Lambda;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;


public class LambdaTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); 
         list.add("AAA");
         list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add("EEE");

        System.out.println("정렬전");
        printList(list);

        Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("정렬후");
        printList(list);
        
    }
   

   };
    

