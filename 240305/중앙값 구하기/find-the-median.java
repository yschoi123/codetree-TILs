import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c) {
            System.out.println((b > c)? b : c);
        } else if(b > c && b > a) {
            System.out.println((a > c)? a : c);
        } else if(c > a && c > b){
            System.out.println((a > b)? a: b); 
        }
    }
}