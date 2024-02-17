package priyansh.arraylist;

import java.util.*;
public class getelement {
    public static void main(String[] args) {
        
        ArrayList<String> Name = new ArrayList<>();
        Name.add("Priyansh");
        Name.add("Ashwin");
        Name.add("Faizan");
        Name.add("Dibyanshu");
        System.out.println("ArrayList : "+Name);

        String str = Name.get(1);
        System.out.print("Element ata index 1 : "+str);
    }
}
