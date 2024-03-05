import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 0;

        for(int i=1; i<=n; i++){
            for(int j=0; j<n; j++){
                if(i%2==0) {
                    num += 2;
                    
                } else {
                    num += 1;
                }

                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}