import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if( a > 0 ) {
            while(b-- > 0) {
                System.out.print(a);
            }
        } else {
            System.out.println(0);
        }
    }
}