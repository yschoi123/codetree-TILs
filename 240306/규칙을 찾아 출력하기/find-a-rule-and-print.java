import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 첫째줄 찍기
        for(int i=0; i<n; i++){
            System.out.print("* ");
        }
        System.out.println();

        // 다음줄 찍기
        for(int i=0; i<n-1; i++){
            System.out.print("* ");
            
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }

            for(int j=0; j<n-2-i; j++){
                System.out.print("  ");
            }
            System.out.println("*");
        }


    }
}