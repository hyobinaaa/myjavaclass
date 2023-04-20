package InterfaceTest;

public class Test {
    public static void main(String[] args) {
        String s1 = "BBC";
        String s2 = "BBC";
        System.out.println(s1.compareTo(s2));

        Student std1 = new Student();
        Student std2 = new Student();
        findlarger(std1, std2);
    }


    public static void findlarger(Comparable c1 , Comparable C2){
        if(c1.compareTo(C2) == 0){
            System.out.println("같다");
        }else if(c1.compareTo(C2) >= 0){
            System.out.println("첫번째가 크다");
        }else{
            System.out.println("두번째가 크다");
        }
    }
}
