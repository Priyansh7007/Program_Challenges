package priyansh.rivision;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any number to find factorialof the given number = ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n ; i++){
            fact = fact*i;
        }
        System.out.println("factorial of the given number is = "+fact);
        sc.close();
    }
}
