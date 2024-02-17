package priyansh.String;

public class string {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World!");
        System.out.println(str);

        String s = new String("Hello");
        s = s.concat(" World");
        System.out.println(s);
    }
}