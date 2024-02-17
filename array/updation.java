package priyansh.array;

import java.util.Scanner;

public class updation {
    
    public static void main(String[] args) {
        int index , i , element;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array = ");
        for(i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
            sc.close();
        }

        System.out.print("The array is = ");
        for(i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter the index where element update = ");
        index = sc.nextInt();
        System.out.println();

        System.out.print("Enter the element for update = ");
        element = sc.nextInt();

        arr[index] = element;

        System.out.println("after the updation the array is = ");
        for(i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
       sc.close();
    }
}
