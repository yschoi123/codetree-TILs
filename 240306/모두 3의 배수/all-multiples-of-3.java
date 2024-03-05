import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int result = 1;
        for(int i=0; i<5; i++){
            int val = sc.nextInt();

            if(val%3 != 0) {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}