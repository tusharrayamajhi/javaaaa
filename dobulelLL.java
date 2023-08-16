public class dobulelLL {
    public static class Node{
        int data;
        Node next;
        Node pre;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.pre = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.pre = tail;
        tail = newNode;

    }
    public void printll(){
        if(head == null){
            System.out.println("empty ll");
            return;
        }
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.pre;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        dobulelLL ll = new dobulelLL();
        ll.addFirst(2);
        ll.addLast(1);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.printll();
    }
}
