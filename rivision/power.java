package priyansh.rivision;

import java.util.Scanner;

 

public class power {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number = ");
    int n = sc.nextInt();
    System.out.print("Enter the power = ");
    int pow = sc.nextInt();
    double res = Math.pow(n, pow);
    System.out.println("the result of the given number = "+(int)res);
    sc.close();
   } 
}
