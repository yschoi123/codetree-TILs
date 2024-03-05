import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int size = 2*n -1;

        for(int i=0; i<size; i++){
            if(i<n) {
                for(int j=0; j<size; j++){
                    if( j>=(n-1)-i && j<=(n-1)+i){
                        if(i%2==0) {
                            if((j-(size-1)/2%2)%2==0) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        } else {
                            if((j-(size-1)/2%2)%2!=0) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
               
            } else {
                for(int j=0; j<size; j++){
                    if( j>=(n-1)-(size-i-1) && j<=(n-1)+(size-i-1)){
                        if(i%2==0) {
                            if((j-(size-1)/2%2)%2==0) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        } else {
                            if((j-(size-1)/2%2)%2!=0) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
             System.out.println();
        }
    }
}