package Javaclasstest;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("문자열을 입력하세요 >"); // 스캐너 를 이용해서 문자열 입력받기
            str = sc.next();

            if (str.equals("quit") == true)
                            break;
            if (str.matches("^www\\.(+)")){
                System.out.println(str + "은 'www'로 시작합니다."); // 만약에 이러한 문자열을  다음과 같이입력하면 출력
            } else   {
                System.out.println(str + "은 'www' 로 시작하지 않습니다."); // 예시 문자열을 입력하면  다음과 같이 출력
            }
            }
        }
    }
    

