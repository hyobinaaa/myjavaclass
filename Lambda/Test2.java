package Lambda;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        
    }
    // collection framework : List, Set, Map, Stack, Queue
    // collection framework는 여러 개의 값을 저장하는 자바의 자료구조
    // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할 수 있다
    // List<Person>, Set<Integer> , Map<String, Person>,....
    public static void printPersonOlderThan(List<Person> persons, int age){
        // persons 리스트의 각 원소에 대해서 반복문을 수행한다
        // 각 원소를 person 타입의 변수 p에 저장.
        for (Person p : persons) {
            if(p.getAge() => age){
                p.printPerson();
            }

        }

    }
    
}
