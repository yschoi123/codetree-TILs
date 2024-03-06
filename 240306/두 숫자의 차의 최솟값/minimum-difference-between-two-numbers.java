import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
    
        // 오름차순으로 입력이 주어졌으므로
        // 두 수 차의 후보값은 인접한 두 숫자의 차이임
        int min = numbers[1] - numbers[0];

        for(int i=1; i<n-1; i++){
           int diff = numbers[i+1] - numbers[i];
           if(diff < min) {
                min = diff;
           }
        }
        System.out.print(min);
    }
}