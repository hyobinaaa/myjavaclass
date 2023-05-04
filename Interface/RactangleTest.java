package Interface;

public class RactangleTest {
    public static void main(String[] args) {
        Ractangle r1 = new Ractangle(100, 30);
        Ractangle r2 = new Ractangle(200, 10);
        int result = r1.ComparableTo(r2);
        if(result == 1)
            System.out.println(r1 + "가 더큽니다");

        else if(result == 0)
            System.out.println("같습니다");
        else
            System.out.println(r2 + "가 더큽니다.");
    }
    
}
