import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while(true) {
            // 나이 입력 받기
            int age = sc.nextInt();
            
            // 나이가 20대가 아니면 반복문 종료
            if(age < 20 || age > 29) {
                break;
            } 

            sum += age;
            count++;
        }

        System.out.println(String.format("%.2f", (double) sum/count));
        
    }
}