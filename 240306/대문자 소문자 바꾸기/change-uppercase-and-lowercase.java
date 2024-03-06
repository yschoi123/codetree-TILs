import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] charArr = sc.next().toCharArray();

        char diff = 'a' - 'A';

        for(int i=0; i<charArr.length; i++){
            if(charArr[i] >= 'a' && charArr[i] <='z'){
                charArr[i] -= diff;
            } else {
                charArr[i] += diff;
            }
        }

        System.out.print(String.valueOf(charArr));
    }
}