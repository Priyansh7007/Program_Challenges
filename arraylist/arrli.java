package priyansh.arraylist;
 
import java.util.*;

public class arrli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array list = ");
        int n = sc.nextInt();
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
        //System.out.println("Add the array element = ");
        for(int i = 1 ; i<=n ; i++){
            arrli.add(i);
        }
        System.out.println(arrli);
        sc.close();
    }
}
