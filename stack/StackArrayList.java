package priyansh.stack;

import java.util.ArrayList;

public class StackArrayList {
    static class Stack{
       static ArrayList<Integer> list = new ArrayList<>();

       public static boolean isEmpty(){
        return list.size() == 0;
       }
       //push operation

       public static void push(int data){
        list.add(data);
       }

       //pop operation

       public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
       }

       //peek operartion

       public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
       }

    }
    public static void main(String[] args) {
        //Stack obj = new Stack();
        // obj.push(1);
        // obj.push(2);
        // obj.push(3);
        // obj.push(4);

        // while(!obj.isEmpty()){
        //     System.out.println(obj.peek());
        //     obj.pop();
        // }
    }
}
