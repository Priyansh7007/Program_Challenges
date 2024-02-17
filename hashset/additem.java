package priyansh.hashset;

import java.util.HashSet;

public class additem {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("volvo");
        cars.add("maruti");
        cars.add("tata");
        cars.add("toyota");
        cars.add("mahindra");

        System.out.println(cars);
    }
}
