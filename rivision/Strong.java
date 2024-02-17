package priyansh.rivision;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        int number , Temp ,reminder ,sum = 0 , i , factorial;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check = ");
        number = sc.nextInt();

        Temp = number;
        while(Temp>0){
            factorial = 1;
            i = 1;
            reminder = Temp % 10;
            while(i<=reminder){
                factorial = factorial*i;
                i++;
            }
            System.out.println("factorial of the "+reminder+" = "+factorial);
            sum = sum + factorial;
            Temp = Temp / 10 ;
        }
        System.out.println("the sum of the factorial of a given number is = "+sum);
        if(number == sum){
            System.out.println(number +" is strong number.");
        }
        else{
            System.out.println(number+" is not a strong number.");
        }
        sc.close();
    }
}
