package priyansh.recursion;

public class factorial {
    public static void main(String[] args) {
        int a = 5;
        long result = fact(a);
        System.out.println("Fcatrorial of the given number is = "+result);
    }
    public static int fact(int a) {
        if(a>=1){
        return a * fact(a-1); 
        }
        else{
            return 1;
        }
    }
   // scan.close();
}
