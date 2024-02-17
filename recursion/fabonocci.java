package priyansh.recursion;
import java.util.*;

public class fabonocci {
    public static int fibonocci(int n){
        if(n == 0){
        return 0;
        }
        else if(n == 1 || n == 2){
            return 1;
        }
        else{
            return(fibonocci(n-1)+ fibonocci(n-2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        System.out.println("the fabonoccin series is = ");
        for(int i = 0 ; i<=n ; i++){
         System.out.print(fibonocci(i)+" ");
        }
        sc.close();
    }
     
}
