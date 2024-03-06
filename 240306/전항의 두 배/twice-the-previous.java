import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[10];

        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();

        for(int i=2; i<10; i++){
            numbers[i] = numbers[i-1] + 2 * numbers[i-2];
        }

        for(int number : numbers){
            System.out.print(number+" ");
        }
    }
}