import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        for(int i = 1; ; i++){
            n /= i;
            count += 1;
            if(n <= 1){
                break;
            }
        }

        System.out.println(count);
    }
}