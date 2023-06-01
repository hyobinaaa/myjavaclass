package Lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;;

public class Test2 {
    public static void main(String[] args) {

        Person p1 = new Person("홍길동", LocalDate.of(2000, 1, 4 ), "gdhong@gmail.com" , Sex.MALE);
        Person p2 = new Person("일지매", LocalDate.of(1999, 2, 4 ), "gmail@gmail.com" , Sex.MALE);
        Person p3 = new Person("박문수", LocalDate.of(1998, 3, 2 ), "park22@gmail.com" , Sex.MALE);
        
        // list는 인터페이스, 이 인터페이스를 구현하는 클래스로
        // ArrayList, Linkedlist 등이 있다
        List <Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);



        printPersonOlderThan(list, 23);


        // CheckPerson 인터페이스를 implements 하는 클래스를 하나 생성해서
        // printPerson 메소드를 호출해라
        // 단, 이 메소드의 의해 출력되는 Person 객체는 성별이 남자만 객체이어야 한다

        // 위와 똑같이 성별이 남자인 객체면 출력하도록
        // printPerson 메서드를 호출하되, 무명클래스를 이용해봐라
        // CheckPerson 인터페이스를 구현하는 무명클래스를 생성해 printPersons 메서드를 호출하면 된다
        // 클래스 선언과(정의와) 객체생성을 동시에 할 수있는 방법이 무명클래스 

        printPerson(
            list,
            new CheckPerson(){
                @Override
                public boolean test(Person P){
                    return P.getGender() == Sex.MALE;
                }
        
            }
        );

   

        


    }


    // collection framework : List, Set, Map, Stack, Queue
    // collection framework는 여러 개의 값을 저장하는 자바의 자료구조
    // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할 수 있다
    // List<Person>, Set<Integer> , Map<String, Person>,....
    
    public static void printPersonOlderThan(List<Person> persons, int age){
        
        // persons 리스트의 각 원소에 대해서 반복문을 수행한다
        // 각 원소를 person 타입의 변수 p에 저장.
        
        for (Person p : persons) {
            if(p.getAge() >= age){
                p.printPerson();
                System.out.println();
            }

        }

    }

    // List<Person> list, int Low, int high
    // 위 세개의 매개변수를 통해 Person 객체 리스트와, 나이의 범위(Low 이상, high 미만)를
    // 입력으로 받아, 저 나이 범위의 Person 정보만 출력하는 메소드
    // printPersonWithAgeRange 로 구현

    int low = 20;
    int high = 30;

    
public static void printPersonWithAgeRange(List<Person> list, int low, int high) {
    for (Person person : list) {
        if (person.getAge() >= low && person.getAge() < high) {
            System.out.println(person);
        }
    
    }
}

public static void printPerson(List <Person> list, CheckPerson tester){
    for(Person p : list){
        if(tester.test(p)){
            p.printPerson();
            System.out.println();
        }
    }
}

interface CheckPerson{
    boolean test(Person p);
}

class CheckPersonMale18to25 implements CheckPerson{
    @Override
    public boolean test(Person p){
        return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
    }
}

}

