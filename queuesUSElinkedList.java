public class queuesUSElinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Queues{
        static Node head;
        static Node tail;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(head == null){
                System.out.println("Queues is Empty");
                return -1;
            }
            int temp = head.data;
            head = head.next;
            return temp;
        }
        public static int peek(){
            if(head == null){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queues q = new Queues();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}