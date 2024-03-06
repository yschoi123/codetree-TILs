import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int length = 10;
        int[] values = new int[length];

        for(int i=0; i<length; i++){
            values[i] = sc.nextInt();
            if(values[i]%3==0){
                System.out.print(values[i-1]);
                break;
            }
        }
    }
}