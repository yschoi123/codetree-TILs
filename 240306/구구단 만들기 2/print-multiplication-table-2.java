import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<4; i++){
            int operand = 2*(i+1);
            for(int j=b; j>=a; j--) {
                System.out.print(j+" * "+operand+" = "+j*operand);
                if(j!=a){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}