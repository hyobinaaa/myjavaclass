package InterfaceTest;

public class Test {
    public static void main(String[] args) {
        String s1 = "BBC";
        String s2 = "BBC";
        System.out.println(s1.compareTo(s2));

        // Student std1 = new Student();
        // Student std2 = new Student();
        // findlarger(std1, std2);
        Car c1 = new Car("브랜드1", "모델1", 1, 2000);
        Car c2 = new Car("브랜드2", "모델2", 1, 1000);
        Car c3 = new Car();
        System.out.println(c3); // [브래든:Unknown , 모델: Unknown , speed:0 , price:0]

        findLarger(c1, c2);

    }


    public static void findLarger(Comparable c1 , Comparable C2){
        if(c1.compareTo(C2) == 0){
            System.out.println("같다");
        }else if(c1.compareTo(C2) >= 0){
            System.out.println("첫번째가 크다");
        }else{
            System.out.println("두번째가 크다");
        }
    }
}
