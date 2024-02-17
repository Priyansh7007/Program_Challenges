package priyansh.array;

import java.util.Scanner;

public class search {
    
    public static void main(String[] args) {
        int i , j = 0  , element;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element of array : ");
        for(i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            sc.close();
        }

        System.out.print("Enter element who search in array = ");
        element = sc.nextInt();
        while(j < n ){
            if(arr[j] == element){
                break;
            }
            j++;
        }
        System.out.println("the given element found in given array at index "+j+".");
        sc.close();
    }
}
