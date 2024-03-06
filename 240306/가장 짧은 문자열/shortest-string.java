import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);


        int len1 =  sc.next().length();
        int len2 =  sc.next().length();
        int len3 =  sc.next().length();

        int max = len1;
        int min = len1;

        // 가장 긴 문자열 길이 구하기
        if(max < len2) {
            max = len2;
        }
        if(max < len3) {
            max = len3;
        }

        // 가장 짧은 문자열 길이 구하기
         if(min > len2) {
            min = len2;
        }
        if(min > len3) {
            min = len3;
        }
        
        System.out.print(max-min);
    }
}