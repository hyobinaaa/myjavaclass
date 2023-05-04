package Interface;

interface Days{
    public static final int SUNDAY = 1,MONDAY = 2 ,TUSEDAY = 3, WHDNESDAY = 4, THURSDAY = 5, FRIDAY= 6,SATURDAY = 7;

}

public class DayTest implements Days {
    public static void main(String[] args) {
        System.out.println("월요일" + MONDAY);
    }
}
