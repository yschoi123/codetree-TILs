import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int a = sc.nextInt();

        // a 값이 3의 배수면 YES를, 아니면 NO 출력
        if(a%3 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // a 값이 5의 배수면 YES를, 아니면 NO 출력
        if(a%5 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}