import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();

        char[] charArr = s.toCharArray();

        while(q-- > 0){
            int qNum = sc.nextInt();
            switch(qNum) {
                case 1 :
                    int a = sc.nextInt();
                    int b = sc.nextInt();

                    char temp = ' ';
                    temp = charArr[a-1];
                    charArr[a-1] = charArr[b-1];
                    charArr[b-1] = temp;
                    break;
                case 2:
                    char aa = sc.next().charAt(0);
                    char bb = sc.next().charAt(0);

                    for(int i=0; i<charArr.length; i++){
                        if(charArr[i] == aa) {
                            charArr[i] = bb;
                        }
                    }
                    break;
                default:
                    break;
            }
            String newStr = String.valueOf(charArr);
            System.out.println(newStr);
        }
    }
}