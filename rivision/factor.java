package priyansh.rivision;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check = ");
        int num = sc.nextInt();
        for(int i = 1 ; i<=num ; i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
