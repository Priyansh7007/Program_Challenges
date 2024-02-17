package priyansh.array;

import java.util.Scanner;

public class multidimensional {
    
    public static void main(String[] args) {
        
        int i , j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row length = ");
        int n = sc.nextInt();
        System.out.print("Enter the coloumn length = ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.println("Enter the array element : ");
        for(i = 0 ; i < n ; i++){
            for(j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the array is : ");
        for(i = 0 ; i < n ; i++){
            for(j = 0 ; j < m ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
