import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strArr = new String[n];

        for(int i=0; i<n; i++){
            strArr[i] = sc.next();
        }

        char start = sc.next().charAt(0);

        int count = 0;
        int sum = 0;

        for(String str : strArr){
            if(str.charAt(0) == start) {
                count++;
                sum += str.length();
            }
        }

        System.out.print(count+" "+String.format("%.2f", (double)sum/count));
    }
}