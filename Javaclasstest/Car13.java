package Javaclasstest;



public class Car13 {
    

    private String model;
    private String color;
    private int speed;
  
    // 자동차의 시리얼 넘버
    private int id;
    private static int numbers;
  
    // 상수란? : 한번 초기화되면 절대 값을 변경할 수 없는 값
    // 자바에서 상수를 선언하는 방법 final keyword를 통해 생성
    // 자바에서 상수는 static으로 만드는 것이 바람직
    // 상수는 일반적으로 public 으로 선언한다(열어둬도 변경할 수 없다)
    // 상수는 대문자로 표기하는 것이 관례
    public static final int MAX_SPEED;
    static
    {
        MAX_SPEED = 350;
        System.out.println("MAX_SPEED가 초기화되었습니다.");
    }
    
    {
        model = "그랜저";
        color = "흰색";
    }
  
   
    Car13(String argModel, String argColor, int argSpeed) {
      this.id = ++numbers;
      this.model = argModel;
      this.color = argColor;
      this.speed = argSpeed;
    }
  
    // static method가 맞는가? instance method가 맞는가? : static
    // static method는 instance method를 호출할 수 있는가? 없는가? : 없다
    public static int getNumbers() {
      // print();
      return numbers;
    }
  
     // instance method : instance(객체)가 생성되어야만 존재하는 메소드
    public void print() {
      System.out.println("ㅎㅇ");
    }
  
    @Override
    public String toString() {
      return (
        "모델 : " +
        this.model +
        "색상 : " +
        this.color +
        "속도 : " +
        this.speed +
        "아이디 : " +
        this.id +
        "생성된 차의 수 : " +
        this.numbers
      );
    }
  
    public static void main(String args[]) {
      Car13 c1 = new Car13("s600", "white", 80);
      Car13 c2 = new Car13("E500", "blue", 20);
      Car13 c3 = new Car13("E300", "gray", 160);
  
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
  
      // 스태틱을 사용하는 좋은 예시 ex) Math 라이브러리
      double d = Math.sqrt(9);
      System.out.println("9의 제곱근 : " + d);
    }
    
}
