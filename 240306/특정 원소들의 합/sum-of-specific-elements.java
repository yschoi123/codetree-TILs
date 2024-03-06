import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = 4;
        int[][] numbers = new int[4][4];

        // 입력 받기
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // 색칠된 칸에 해당하는 정수들의 합 구하기
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                sum += numbers[i][j];
            }
        }

        System.out.print(sum);

    }
}