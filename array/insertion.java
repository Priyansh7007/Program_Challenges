package priyansh.array;

import java.util.Scanner;

// insert element end of array.......

public class insertion {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
       // sc.close();
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n+1];

        System.out.println("Enter the element in array = ");
        for( i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();

            // before run remove sc.close(); than execute the program.....

            sc.close();
            
        }
         
        System.out.print("The array is = ");
        for( i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter which element who insert in array = ");
        int num = sc.nextInt();
        
        arr[i] = num;
        
        System.out.println("After insertion the array is = ");
        for( i = 0 ; i < n+1 ; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
        
    }

}
