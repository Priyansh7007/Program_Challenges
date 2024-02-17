package priyansh.recursion;

import java.util.Scanner;

public class question3 {
    
    public static int power(int base , int pvalue){
        if(pvalue == 1){
            return base;
        }
        else{
            return base*power(base, pvalue-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value = ");
        int b = sc.nextInt();
        System.out.print("Enter the power value = ");
        int p = sc.nextInt();

        System.out.println("the power of the given base value is = "+power(b, p));

        sc.close();
        
    }
}
