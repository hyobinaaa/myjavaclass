// 메소드로 객체가 전달되는 경우

package Javaclasstest;

public class MyCounter {
    int value = 0;
    void inc(MyCounter ctr){
        ctr.value = ctr.value + 1;
    }
    
}
