import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();
        
        // a 이상 b 이하의 짝수 내림차순으로 출력
        int i = b;
        while(i >= a) {
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
            i--;
        }
    }
}