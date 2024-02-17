package priyansh.hashmap;

import java.util.*;
public class clearitem {
   public static void main(String[] args) {
    HashMap <String , String > capitalcities = new HashMap<>();

        capitalcities.put("india", "delhi");
        capitalcities.put("england", "london");
        capitalcities.put("germany", "berlin");

        capitalcities.clear();
        System.out.println(capitalcities);
   } 
}
