package priyansh.array;

import java.util.Scanner;

public class firstpositioninsetion {
    
    public static void main(String[] args) {
        int i,element ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenegth of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int new_arr [] = new int[n+1];

        System.out.println("Enter the element of array = ");
        for(i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            sc.close();
        }

        System.out.println("Enter the element who insert in array = ");
        element = sc.nextInt();

        for(i = 0 ; i <n+1 ; i++ ){
             new_arr[i+1]=arr[i];
         }

        new_arr[0] = element;

        // for(i = 0 ; i <n+1 ; i++ ){
        //    new_arr[i+1]=arr[i];
        // }

        System.out.println("after insertion the array is = ");
        for(i = 0 ; i < n+1; i++){
            System.out.print(new_arr[i]+" ");
        }

        
        sc.close();
    }
}
