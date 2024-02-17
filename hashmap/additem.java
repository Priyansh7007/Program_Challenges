package priyansh.hashmap;

import java.util.HashMap;

public class additem {
    public static void main(String[] args) {
        HashMap <String , String > capitalcities = new HashMap<>();

        capitalcities.put("india", "delhi");
        capitalcities.put("england", "london");
        capitalcities.put("germany", "berlin");

        System.out.println(capitalcities);
    }
}
