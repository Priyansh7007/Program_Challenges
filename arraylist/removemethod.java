package priyansh.arraylist;

import java.util.*;

public class removemethod {

    public static void main(String[] args) {
        
        ArrayList<String> Name = new ArrayList<>();
        Name.add("Priyansh");
        Name.add("Ashwin");
        Name.add("Faizan");
        Name.add("Dibyanshu");
        System.out.println("ArrayList : "+Name);

        String str = Name.remove(3);
        System.out.println("Updated Arraylist : "+Name);
        System.out.print("removed element is  : "+str);
    }
    
}
