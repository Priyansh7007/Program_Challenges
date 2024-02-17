package priyansh.rivision;

import java.util.Scanner;

public class typecosting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to change = ");
        char ch  = sc.next().charAt(0);
        int n = (ch);
        System.out.println("the number of given charecter is = "+n);

        System.out.print("Eneter the integer number to convert char = ");
        int number  = sc.nextInt();
        char chart = (char)number;
        System.out.println("the charecter of the given number is = "+chart);
        sc.close(); 
    }
}
