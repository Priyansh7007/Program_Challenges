package priyansh.recursion;

import java.util.Scanner;

public class sumofseries {
    public static int num(int n) {
        if(n > 0){
            return n + num(n-1); 
        }
        else{
            return 0;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term = ");
        int n = sc.nextInt();
        int sum = num(n);
        System.out.println("the sum of the given number series = "+ sum);

        sc.close();

    }
}
