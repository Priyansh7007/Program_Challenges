package priyansh.arraylist;

import java.util.*;
public class setmethod {
    public static void main(String[] args) {
        
        ArrayList<String> Name = new ArrayList<>();
        Name.add("Priyansh");
        Name.add("Ashwin");
        Name.add("Faizan");
        Name.add("Dibyanshu");
        System.out.println("before changes ArrayList : "+Name);

        Name.set(1, "Ashwin kumar singh");
        System.out.println("After changes ArrayList = "+Name);
    }
}
