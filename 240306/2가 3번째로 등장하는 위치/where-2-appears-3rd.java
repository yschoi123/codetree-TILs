import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] values = new int[n];

        int count = 0;

        for(int i=0; i<n; i++){
            values[i] = sc.nextInt();
            if(values[i] == 2){
                count++;
                if(count == 3) {
                    System.out.print(i+1);
                    break;
                }
            }
        }
    }
}