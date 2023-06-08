package generic;

public class GenericTest2 {
    public static void main(String[] args) {

        // GenericPair  클래스 객체 2개 생성해서 값을 넣고 빼고 해보세요

        // Generic 클래스의 타입 파라미터 값으로는 반드시 참조형 타입이 와야한다
        // 기초자료형(Primitive type)은 절대 올 수없다
        
        GenericPair<String, Integer> pair1 = new GenericPair<>("Hello", 123);
        
   
        String firstValue = pair1.getFirst();
        Integer secondValue = pair1.getSecond();
        System.out.println("pair1: " + firstValue + ", " + secondValue);
        
        
        pair1.setFirst("World");
        pair1.setSecond(456);
        System.out.println("pair1: " + pair1.getFirst() + ", " + pair1.getSecond());
        
       
        GenericPair<Double, String> pair2 = new GenericPair<>(3.14, "Java");
        
       
        Double firstValue2 = pair2.getFirst();
        String secondValue2 = pair2.getSecond();
        System.out.println("pair2: " + firstValue2 + ", " + secondValue2);
        
        
        pair2.setFirst(2.718);
        pair2.setSecond("Programming");
        System.out.println("pair2: " + pair2.getFirst() + ", " + pair2.getSecond());
    }
        
    }
    

