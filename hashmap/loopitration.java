package priyansh.hashmap;

import java.util.*;

public class loopitration {
    public static void main(String[] args) {
        HashMap <String , String > capitalcities = new HashMap<>();

        capitalcities.put("india", "delhi");
        capitalcities.put("england", "london");
        capitalcities.put("germany", "berlin");

        //System.out.println(capitalcities.size());
        
        for(String i : capitalcities.keySet()){
            System.out.println(i);
        }

        for(String i : capitalcities.values()){
            System.out.println(i);
        }
    
    }
}
