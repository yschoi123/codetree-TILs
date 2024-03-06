import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] counts = new int[10]; 
        while(a>1){
            counts[a%b] += 1;
            a /= b;
        }

        int result = 0;
        for(int i=0; i<10; i++){
            result += counts[i] * counts[i];
        }
        System.out.print(result);
    }
}