import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        // 맨 앞에 있는 문자 e 지우기
        int idx = str.indexOf("e");
        str = str.substring(0, idx) + str.substring(idx+1);

        System.out.print(str);
    }
}