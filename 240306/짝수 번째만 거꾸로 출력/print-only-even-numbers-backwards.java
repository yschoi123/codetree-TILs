import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int idx = str.length()-1;
        if((idx+1)%2 != 0) {
            idx--;
        }

        for(int i=idx; i>=1; i-=2){
            System.out.print(str.charAt(i));
            
        }
        
    }
}