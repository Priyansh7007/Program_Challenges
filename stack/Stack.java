package priyansh.stack;

import java.util.Scanner;

public class Stack {
    int top = -1;
    int n = 10;
    int a [] = new int[n];
    void push(){
        if(top==(n-1)){
            System.out.println("Stack OverFlow....");
        }else{
            System.out.print("Enter the data = ");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            top = top+1;
            a[top] = data;
            System.out.println("Data inserted......");
            sc.close();
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack UnderFlow....");
        }else{
            top = top-1;
            System.out.println("item deleted....");
        }
    }
    void display(){
        System.out.println("items are =>");
        for(int j = top ; j>=0 ; j--){
            System.out.print(a[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int d ;
        int l;
       
         do{
            System.out.println("NOTE :- Press 1 to PUSH , Press 2 to POP , Press 3 to Display......");
            System.out.println("Enter any choice = ");
             d = sc.nextInt();
             switch(d){
                case 1:
                {
                    s.push();
                    break;
                }
                case 2 :
                {
                    s.pop();
                    break;
                }
                case 3:{
                    s.display();
                    break;
                } 
            }//System.out.println("Enter 0 to back to MAIN MENU...");
            //  System.out.println("Enter any key to Exit...");
             l = sc.nextInt();
         }while(l==0); {
            System.out.println("Exit Successfully.....");
         }
         sc.close();
    }
}

