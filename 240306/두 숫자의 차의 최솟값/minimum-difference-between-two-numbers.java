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
    
        // 최소값을 담을 min 변수 선언
        int min = numbers[n-1];

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                // 오름차순으로 입력이 주어졌으므로 항상 numbers[j]가 numbers[i]보다 큼
                int diff = numbers[j] - numbers[i];
                if(diff < min) {    // 차이 값이 현재 최소값보다 작으면
                    min = diff;     // 해당 값을 현재 최소값으로 변경
                }
            }
        }
        System.out.print(min);
    }
}