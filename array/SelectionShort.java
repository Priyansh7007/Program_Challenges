package priyansh.array;

public class SelectionShort {
   public static void main(String[] args) {
    int arr[] = {0,23,14,12,9};
    for (int i = 0; i < arr.length; i++) {
        
        for (int j = i+1; j < arr.length; j++) {
            int temp = 0;
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.print(arr[i]+" ");
    }
   }
}
