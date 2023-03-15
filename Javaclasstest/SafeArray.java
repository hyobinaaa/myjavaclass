package Javaclasstest;

public class SafeArray {
    private int[] a;

    public void createArray(int size){
        a = new int[size];
    }

    public void put(int index , int value){
        if (index >= 0 && index < a.length)
            a[index] = value;
        System.out.println("잘못된 인덱스:" + index);
        
    } 
    public static void main(String[] args) {
        SafeArray  array = new SafeArray();
        
        array.createArray(10);

        array.put(2, 10);
        array.put(10, 100);

       
    }
}
