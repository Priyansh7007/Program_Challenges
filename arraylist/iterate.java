package priyansh.arraylist;

import java.util.ArrayList;


public class iterate {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        
            number.add(1);
            number.add(2);
            number.add(3);
            number.add(4);
         System.out.print("the arrayList is : ");
         for(int i : number){
            System.out.print(i+" ");
         }   
        
         
    }
    
}
