import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int i = a;
        while(i <= b){
            if(i % 2 == 0){ // 짝수만 출력
                System.out.print(i+" ");
            }
            i++;
        }
    }
}