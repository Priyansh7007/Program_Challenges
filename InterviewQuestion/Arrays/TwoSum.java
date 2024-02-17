package priyansh.InterviewQuestion.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {7,6,3,8,2};
        int target = 14;
        int i, sum = 0;
        int j; 
        for(i = 0 ; i < arr.length ; i++){
            for(j = i+1 ; j < arr.length ; j++){
                sum = arr[i] + arr[j];
                if(target == sum ){
                    System.out.println(arr[i]+" "+arr[j]);
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
