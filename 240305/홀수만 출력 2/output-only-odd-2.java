import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // a 이하 b 이상의 홀수 내림차순 출력
        for(int i = a; i >= b; i-- ){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}