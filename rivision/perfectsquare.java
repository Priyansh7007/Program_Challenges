package priyansh.rivision;

import java.util.Scanner;

public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = sc.nextInt();
        double n = Math.sqrt(number);
        System.out.println(n);
        double x = n*n;
        int res = (int)x;
        if(res == number){
            System.out.println(number+" The given number is perfect squre number.");
        }
        else{
            System.out.println(number+" the given number is not a perfect squre number.");
        }
        sc.close();
    }
}
