
public class stackLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{
        public static Node head;
        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public int pop(){
            if(head == null){
                return -1;
            }
            Node temp = head;
            head = head.next;
            return temp.data;
        }
        public int peek(){
            if(head == null){
                return -1;
            }
            return head.data;
        }
        public boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek()+" ");
        while(!s.isEmpty()){
            System.out.println(s.pop()+ " ");
        }

    }
}
