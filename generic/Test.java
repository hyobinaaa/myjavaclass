package generic;

public class Test {
    public static void main(String[] args) {
       StrBox sb1 = new StrBox();
       sb1.setValue("동해물과");

       StrBox sb2 =  new StrBox();
       sb2.setValue("백두산이");

       String result = sb1.gerValue() + sb2.gerValue();
       System.out.println(result);

       int idx = result.indexOf("백두산이");
       System.out.println(result.substring(idx));
    }
    
}
