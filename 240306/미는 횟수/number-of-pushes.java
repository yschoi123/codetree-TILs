import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String originA = new String(A);
        
        int n = 0;


        while(true) {
            A = A.substring(A.length()-1) + A.substring(0, A.length()-1);
            n++;

            if(A.equals(B)){
                System.out.print(n);
                break;
            } 

            if(A.equals(originA)) {
                System.out.print(-1);
                break;
            }
        }
    }
}