package priyansh.leetcode;

import java.util.Scanner;

public class pelindrom {
     
    
    public static boolean check(int x ){
        int sum = 0;
        int temp = x;
        while(x>0){
             
            sum = sum * 10 + x % 10;;
            x = x / 10;
        }
        if(sum == temp){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check = ");
        int num = sc.nextInt();

        System.out.println(check(num));

        sc.close();
    }
    
}
