package Interface;


public interface MyConstant{
    int NORTH = 1;
    int EAST = 2;
    int SOUTH = 3;
    int WEST = 4;
}
public class DirectionTest implements MyConstant {
    public static void main(String[] args) {
        System.out.println("NORTH:" + MyConstant.NORTH);
        System.out.println("SOUTH:" + MyConstant.SOUTH);

        System.out.println("WEST:" +MyConstant.SOUTH);
    }
    
}
