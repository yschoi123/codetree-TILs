import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] charArr = s.toCharArray();
        
        char second = charArr[1];
        for(int i=1; i<charArr.length; i++){
            if(charArr[i]==second) {
                charArr[i] = charArr[0];
            }
        }

        System.out.println(String.valueOf(charArr));
    }
}