package priyansh.recursion;

import java.util.Scanner;

public class palindromnumber {
    public static int palindrom(int n ) {
        if(n > 0){
           return palindrom( n-1);
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check = ");
       // int n = sc.nextInt();
        //int temp = n;
        sc.close();
    }
}
