import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // n개의 정수 입력 받으면서 합 구하기
        int sum = 0;
        while(n-- > 0){
            sum += sc.nextInt();
        }

        // n개의 정수 합을 문자열로 변환
        String str = String.valueOf(sum);

        // 문자열 좌측으로 한칸 밀기
        str = str.substring(1) + str.substring(0, 1);

        // 결과 출력
        System.out.print(str);
    }
}