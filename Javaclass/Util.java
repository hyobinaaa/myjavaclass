package Javaclass;

public class Util {
    
    public static void selectionSort (int[] values) {

        for(int i = 0; i < values.length; i++){
            int minIdx = i;
            for (int j =  i+1; j < values.length ; j++){
                // 현재까지 찾은 최소값(values[minIdx]가 가르키는 값)
                // values[j]를 비교해서 values[j]가 더 작으면
                // minIdx를 j로 설정 : minIdx = j

                if(values[minIdx] > values[j]){
                    minIdx = j;
                }
            } 
        }
        
    }
    
}
