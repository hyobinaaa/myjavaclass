package Javaclasstest;

public class StringTest {
        // string 객체는 imutable입니다. mutable이 아닙니다.
       // 이말은 string 객체 값으로 변경할수 없다.

       
    public static void main(String[] args) {
        String proverb = "A barking dog"; // new 연산자 생략
        String s1 , s2 , s3 , s4; // 참조변수로서 메소드에서 반환된 참조된 값을 받는다.

        System.out.println("문자열의 길이 =" + proverb.length());
        

        s1 = proverb.concat("never Bites!");  // 문자열 결합
        s2 = proverb.replace('B' , 'b' );  // 문자 교환
        s3 = proverb.substring(2,5);  // 부분 문자열 추출
        s4 = proverb.toUpperCase();  //대문자로 변환

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


    }
    
}
