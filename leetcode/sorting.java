package priyansh.leetcode;

import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array element"); 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[j] = arr[j+1];
                }
            }
            System.out.println(arr[i]+",");
        }
        sc.close();
    }
}
