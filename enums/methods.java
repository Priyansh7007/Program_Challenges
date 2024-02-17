package priyansh.enums;

public class methods {
    enum month{
        JAN , FEB ,MARCH ;
    }
    public static void main(String[] args) {
        for(month m : month.values()){
            System.out.println(m);
        }
        System.out.println(month.valueOf("JAN"));
        System.out.println("index of the january "+ month.valueOf("JAN").ordinal());
    }
}
