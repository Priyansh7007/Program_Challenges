package priyansh.rivision;

import java.util.Scanner;

public class pelindrom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Emter the number to check = ");
    int n = sc.nextInt();
    int temp = n;
    int rem , sum = 0;
        while(n>0){
             rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;

        }
        if(sum == temp){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
  }  
}
