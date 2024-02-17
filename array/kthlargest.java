package priyansh.array;

import java.util.Scanner;

public class kthlargest {
    public static void main(String[] args) {
        int arr[] = {21,22,13,15,14};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position = ");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if(arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            //System.out.print(arr[i]+" ");
        }
        System.out.println("the "+n+" gratest number in array is = "+arr[n-1]);
        sc.close();
    }
}
