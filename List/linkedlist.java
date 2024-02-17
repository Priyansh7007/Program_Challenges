package priyansh.List;


public class linkedlist {
    
    NodeList head;
	    public static class NodeList{
	        public int data;
	        public NodeList next;
	       

	        public NodeList(int data){
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public void display(){
	        NodeList current = head;
	        while(current != null){
	            System.out.print(current.data+"-->");
	            current = current.next;
	        }
	        System.out.print("null");
	    }

	    public static void main(String[] args) {
	        linkedlist s = new linkedlist();
	        s.head = new NodeList(10);
	        NodeList second = new NodeList(11);
	        NodeList third = new NodeList(12);
	        NodeList fourth = new NodeList(14);

	        s.head.next = second;
	        second.next = third;
	        third.next = fourth;

	        s.display();
	    }

}
