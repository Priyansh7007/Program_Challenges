package priyansh.recursion;

import java.util.Scanner;

public class Question2 {
    
    public static int TotalNumber(int n){
        
        if(n==0){
            return 0;
        }else{
           return 2 + TotalNumber(n-1);
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of cats = ");
       int num = sc.nextInt(); 

       System.out.println("the number of eyes = "+ TotalNumber(num));

       sc.close();
    }
    
}
