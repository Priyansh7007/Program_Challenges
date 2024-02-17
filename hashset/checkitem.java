package priyansh.hashset;

import java.util.HashSet;

public class checkitem {
    public static void main(String[] args) {
        HashSet <String> cars = new HashSet<>();
        cars.add("volvo");
        cars.add("maruti");
        cars.add("tata");
        cars.add("toyota");
        cars.add("mahindra");

        Boolean check = cars.contains("mahindra");
        System.out.println(check);

    }
}
