import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 입력 숫자 개수를 나타내는 변수 선언
        int n = 5;
        
        // 짝수가 몇번 나오는지 체크하기 위한 변수 선언
        int count = 0;

        while(n-- > 0){
            int value = sc.nextInt();

            // 입력된 숫자가 짝수면 count 값 1 증가
            if(value % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}