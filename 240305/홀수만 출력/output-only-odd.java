import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=a; i<=b; i++) { // i는 a 부터 b 까지 1씩 증가
            if(i % 2 != 0) { // i 값이 홀수면 출력
                System.out.print(i+" ");
            }
        }

    }
}