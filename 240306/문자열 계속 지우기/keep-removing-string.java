import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();

        int aLen = A.length();
        int bLen = B.length();

        for(int i=0; i<aLen-bLen+1; i++){

            boolean isFullCorrect = true;

            for(int j=0; j<bLen; j++){
                if(A.charAt(i+j)!=B.charAt(j)){
                    isFullCorrect = false;
                }
            }

            if(isFullCorrect){
                A = A.substring(0,i) + A.substring(i+bLen, aLen);
                i = (i==0)? -1: i-2;
                aLen = A.length();
            }
        }

        System.out.print(A);
        
    }
}