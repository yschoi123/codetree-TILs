import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int diff = 0;
        if(str1.length()>str2.length() && str1.length() > str3.length()){
            if(str2.length()>str3.length()){
                diff = str1.length() - str3.length();
            } else {
                 diff = str1.length() - str2.length();
            }
        } else if(str2.length()>str1.length() && str2.length() > str3.length()){
            if(str1.length()>str3.length()){
                diff = str2.length() - str3.length();
            } else {
                 diff = str2.length() - str1.length();
            }
        } else {
            if(str1.length()>str2.length()){
                diff = str3.length() - str2.length();
            } else {
                 diff = str3.length() - str1.length();
            }
        }
        System.out.print(diff);
    }
}