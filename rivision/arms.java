package priyansh.rivision;

import java.util.Scanner;

public class arms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range of the given number = ");
        int start = sc.nextInt();
        System.out.print("Enter the ending range of the given number = ");
        int end = sc.nextInt();
        int rem , n,sum =0;
        for (int i = start; i <= end; i++) {
            int temp = i;
            while(i<end){
                rem = i % 10;
                n = rem*rem*rem;
                sum = sum + n; 
                i = i/10;
            }
            if(temp == sum){
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
