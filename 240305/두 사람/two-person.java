import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int age1 = sc.nextInt();
        String name1 = sc.next();

        int age2 = sc.nextInt();
        String name2 = sc.next();

        // 두 사람 중 한 사람이라도 19세 이상이면서 남자면 1 출력
        if((age1 >= 19 && name1.equals("M")) || (age2 >= 19 && name2.equals("M"))){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
    }
}