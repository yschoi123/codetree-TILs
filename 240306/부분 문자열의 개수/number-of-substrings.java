import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int aLen = A.length();
        int bLen = B.length();

        int count = 0;
        for(int i=0; i<aLen-bLen+1; i++){
            if(A.substring(i, i+bLen).equals(B)){
                count++;
            }
        }

        System.out.print(count);
    }
}