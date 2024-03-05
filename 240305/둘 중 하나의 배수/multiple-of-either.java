import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // a가 3의 배수이거나 5의 배수이면 1, 아니면 0 출력
        if( a % 3 == 0 || a % 5 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}