public class Linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size=0;

    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addIndex(int data, int i) {
        if (i > size) {
            System.out.println("out of index");
            return;
        }
        Node newNode = new Node(data);
        if (i == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        int j = 0;
        while (j != i - 1) {
            temp = temp.next;
            j++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node temp = head;
        int j = 0;
        while (j != size - 2) {
            temp = temp.next;
            j++;
        }
        temp.next = null;
        size--;
    }

    public int search(int key) {
        Node temp = head;
        int j = 0;
        while (temp != null) {
            if (temp.data == key) {
                return j;
            }
            temp = temp.next;
            j++;
        }
        return -1;
    }

    private int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        
        int idx =  helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public int searchRec(int key) {
        return helper(head, key);

    }
    public void reverse(){
        Node pre = null;
        Node curr = tail  = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
        
    }
    public void removerNthNodeFromEnd(int i){
        if(i == size){
            head = head.next;
            return;
        }
        int idx = size - i;
        Node temp = head;
        int j = 1;
        while(j < idx){
            temp = temp.next;
            j++;
        }
        temp.next = temp.next.next;
        size--;
    }
    public boolean isPalindrom(){
        if(head == null && head.next == null){
            return true;
        }
        Node temp = head;
        int j = 0;
        while(j != size/2){
            temp = temp.next;
            j++;
        } 
        Node pre = null;
        Node lNode;
        while(temp != null){
            lNode = temp.next;
            temp.next = pre;
            pre = temp;
            temp = lNode;
        }
        Node c = head;
        Node d = tail;
        for(int i = 0;i<size/2;i++){
            if(c.data != d.data){
                return false;
            }
        }
        
        return true;
    }
    public void bintodec(){
        int ans = 0;
        reverse();
        
        int n = size -1;
        Node temp = head;
        while(n>=0){
            ans += (int) temp.data * (int)Math.pow(2, n);
            n--;
            temp = temp.next;
        }
        System.out.println(ans);
    }
    public Node reverseRecurssion(Node head){
        if(head == null || head.next == null){
            
            return head;
        }
        Node newhead = reverseRecurssion(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
        
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addfirst(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        
        head = ll.reverseRecurssion(head);
        // ll.bintodec();
        ll.printLL();
        
        
              
    }
}
