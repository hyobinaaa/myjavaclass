package Lambda;

import java.util.List;

import Lambda.Test2.CheckPerson;

public class Test3 {
    public static void main(String[] args) {
        // 1. person 객체를 5개 이상 생성해 ArrayList에 저장하시오
        // 2. printGender 메소드를 호출하시오.
        // 가. printGender 메소드는 1번에서 생성한 ArrayList의 각 원소에 대해
        // 나. 그원소가 남자이면 "000은 남자입니다"
        // 다. 그원소가 여자이면 "000"은 여자입니다" 를 출력한다
        // 이 코드를 구현해 보세요
        // printGender 메소드를 호출할때, checkPerson 객체를 인자로 넘겨줘야 하는데
            // 그 객체가 남자인지 여자인지 판단해서 남자이면 true를 여자이면 false를 반환한다
    }
    public static void printPersons(List<Person> list, CheckPerson cp) {

        for (Person p : list) {
            if(cp.test(p)) {
                System.out.println(p.getName() + "은 남자입니다");

            } else {
                System.out.println(p.getName() + "은 여자입니다");
            }
        }

    }
}
