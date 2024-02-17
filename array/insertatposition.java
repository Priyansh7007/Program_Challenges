package priyansh.array;

import java.util.Scanner;

public class insertatposition {

    public static void main(String[] args) {

        int i , pos, element;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n+1];

        System.out.println("Enter the element of array = ");

        for( i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();

            // before execution remove sc.close();

            sc.close();
        }

        System.out.print("array is = ");
        for( i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter position where element insert = ");
        pos = sc.nextInt();

        System.out.print("Enter element who insert in array = ");
        element = sc.nextInt();
       
        for(i = (n-1) ; i>=(pos-1) ; i--){
            arr[i+1] = arr[i];

        }

        arr[pos-1] = element;

        System.out.println("after insertion the array is = ");

        for(i = 0 ; i<n+1 ; i++){

            System.out.print(arr[i]+" ");

        }
        
        sc.close();
    }
    
}
