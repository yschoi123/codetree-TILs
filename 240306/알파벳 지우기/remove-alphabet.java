import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int num1 = 0, num2 = 0;
        String numStr1 = "";
        String numStr2 = "";

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)>= '0' && str1.charAt(i)<='9') {
                numStr1 += str1.charAt(i);
            }
        }

        for(int i=0; i<str2.length(); i++){
            if(str2.charAt(i)>= '0' && str2.charAt(i)<='9') {
                numStr2 += str2.charAt(i);
            }
        }

        System.out.print(Integer.parseInt(numStr1) + Integer.parseInt(numStr2));
    }
}