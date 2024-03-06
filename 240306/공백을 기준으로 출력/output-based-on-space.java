import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for(String str : str1.split(" ")){
            System.out.print(str);
        }

        for(String str : str2.split(" ")){
            System.out.print(str);
        }
    }
}