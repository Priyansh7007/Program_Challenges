package priyansh.hashmap;

import java.util.*;

public class removeitem {
    public static void main(String[] args) {
        HashMap <String , String > capitalcities = new HashMap<>();

        capitalcities.put("india", "delhi");
        capitalcities.put("england", "london");
        capitalcities.put("germany", "berlin");

        capitalcities.remove("england");

        System.out.println(capitalcities);
    }
}
