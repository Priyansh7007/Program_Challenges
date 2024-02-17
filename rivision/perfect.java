package priyansh.rivision;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        int sum = 0 ,number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        number = sc.nextInt();
        for(int i = 1; i<number; i++){
            if(number%i==0){
                sum = sum +i;
            }
        }
        if(sum == number){
            System.out.println(number+" is a perfect number.");
        }
        else{
            System.out.println(number+" is a not a perfect number.");
        }
        sc.close();
    }
}
