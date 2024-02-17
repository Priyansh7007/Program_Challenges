package priyansh.recursion;

import java.util.Scanner;

public class Question4 {
    
    public static int fact(int n){
        if(n == 1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        System.out.println("the factorial of the given number is = "+ fact(num));
        sc.close();
    }
}
