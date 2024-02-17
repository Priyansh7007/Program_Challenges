package priyansh.leetcode;

import java.util.Scanner;

public class reverseNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to convert the numbner in reverse = ");
        int n = sc.nextInt();
        int temp = n;
        int rem , rev = 0;

         while(n>0 || n<0){
            rem = n %10;
            rev = rev*10 + rem;
            n = n / 10;
         }
        if(temp == rev){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

         sc.close();
    }
}
