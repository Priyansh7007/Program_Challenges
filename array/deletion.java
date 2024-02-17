package priyansh.array;

import java.util.Scanner;

public class deletion {

    public static void main(String[] args) {

        int i  , pos ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element of array : ");
        for(i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
            sc.close();
        }

        System.out.print("before deletion array is = ");
        for(i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter position where element deleted = ");
        pos = sc.nextInt();

        for(i = pos ; i < (n - 1) ; i++){
            arr[i] = arr[i+1];
        }
        n--;
        
        System.out.println("after deletion the array is = ");
        for(i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }

      sc.close();  
    }
    
}
