package priyansh.rivision;

import java.util.Scanner;

public class fibonocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0,num2 = 1 ,num3;
        System.out.print("Enter the term = ");
        num3 = sc.nextInt();
        System.out.print(num1+" "+num2);
        for(int i = 2;i<num3;i++){
            int n = num1+num2;
          
            num1 = num2;
            num2 = n;
            System.out.print(" "+n);
        }
        sc.close();
    }
}
