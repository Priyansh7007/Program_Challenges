package priyansh.array;

import java.util.Scanner;

public class Occurrences {
   public static void main(String[] args) {
    int arr[] = {1,2,2,3,2,6};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number = ");
    int n = sc.nextInt();

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        
            if(arr[i] == n){
                count++;
            }
       
    }
    System.out.println(count);
    sc.close();
   } 
}
