package Javaclasstest;


class Employee{
    public String name; // 이름 : public 멤버
    String address; // 주소 : package 멤버 
    protected int salary; // 월급 : protected 멤버
    private int rrn; // 주민등록 번호 : private 멤버

    

    public Employee(String name, String address , int salary , int rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    @Override
    public String toString(){ 
        return "Employee [name =" + name + " , address=" + address + " , salary=" + salary + " , rrn=" + rrn + "]";
    }
}

class Manager extends Employee{
    private int bonus;  

    public Manager(String name, String address , int salary , int rrn , int bonus){
        super(name, address , salary , rrn ); 
        this.bonus = bonus;
    }

    void test() {
        System.out.println("name =" + name );
        System.out.println("address" + address);
        System.out.println("salary = " + salary );
        // System.out.println("rrn = " + rrn ); 자식 클래스는 부모 클래스의 private 필드는 접근할 수 없다
    }
}

public class ManagerTest {
    public static void main(String[] args) {
        Manager m = new Manager( "Tom", " Seoul ", 1000000, 123456, 50000);
        System.out.println(m);
        m.test();
    }
    
}
