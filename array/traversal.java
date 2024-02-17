package priyansh.array;

import java.util.Scanner;

public class traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the element of array = ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The element of array is = ");
        for(int i = 0 ; i < n ; i++){
           System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
