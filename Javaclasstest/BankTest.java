package Javaclasstest;

class Bank{
    private double interestRate = 0.0;

    public double getInteresRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
}

class ABank extends Bank{
    public double getInteresRate(){
        return super.getInteresRate()+3.0;
    }
}

class BBank extends Bank{
    @Override
    public double getInteresRate() {
        // TODO Auto-generated method stub
        return super.getInteresRate()+5.0;
    }
}

class CBank extends Bank{
    public CBank(){
        super.setInterestRate(super.getInteresRate()+10.0);
    }
}

public class BankTest {
    public static void main(String[] args) {
        ABank a = new ABank();
        BBank b = new BBank();
        CBank c = new CBank();


        System.out.println("A Bank의 이자율: " + a.getInteresRate());
        System.out.println("B Bank의 이자율: " + b.getInteresRate());
        System.out.println("C Bank의 이자율: " + c.getInteresRate());
    }
    
}
