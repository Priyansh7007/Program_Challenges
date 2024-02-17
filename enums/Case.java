package priyansh.enums;

public class Case {
    enum size{
        SMALL , MEDIUM , LARGE;
    }
    public static void main(String[] args) {
        size myvar = size.MEDIUM;
        switch(myvar){
            case SMALL :
              System.out.println("small size");
              break;
            case MEDIUM :
              System.out.println("medium size");
              break;
            case LARGE :
              System.out.println("large size");
              break;    
        }
    }
}
