package priyansh.enums;

public class loop {
    
    enum month{
        JAN(1),FEB(2),MARCH(3);
        int value;
        private month(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        for(month m : month.values()){
            System.out.println(m+" "+m.value);
        }
    }
}
