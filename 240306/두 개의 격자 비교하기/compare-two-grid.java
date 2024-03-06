import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] board1 = new int[n][m];
        int[][] board2 = new int[n][m];

        // 첫번째 격자 입력 받기
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board1[i][j] = sc.nextInt();
            }
        }

        // 두번째 격자 입력 받기
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board2[i][j] = sc.nextInt();
            }
        }

        // 같은 위치에 있는 숫자에 따른 0, 1로 구성된 격자 출력
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board1[i][j]==board2[i][j]){
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}