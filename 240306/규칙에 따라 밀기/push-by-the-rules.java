import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 문자열 A와 명령 문자열 입력받기
        String A = sc.next();
        String commands = sc.next();

        int lenA = A.length();

        for(char cmd : commands.toCharArray()){
            if(cmd == 'L') {
                A = A.substring(1) + A.substring(0, 1);
            } else {
                A = A.substring(lenA-1) + A.substring(0, lenA-1);
            }
        }
        System.out.print(A);
    }
}