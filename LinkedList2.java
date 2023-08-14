
import java.util.*;

public class LinkedList2 {
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
    public static int size;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int i, int data) {

        Node newNode = new Node(data);
        size++;
        if (i == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        if (i == size-1) {
            tail.next = newNode;
            tail = newNode;
            return;
        }
        Node temp = head;
        int count = 0;
        while (count != i - 1) {
            temp = temp.next;
            ;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void printll() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        if (head.next == null) {
            size--;
            head = tail = null;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeFromLast() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        Node pre = null;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = null;
        tail = pre;
        size--;

    }

    public int iterSearch(int key) {
        Node temp = head;
        int i = 0;
        if (head.data == key) {
            return i;
        }
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int recursivSearch(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = recursivSearch(head.next, key);
        if (idx == -1) {
            return -1;
        } else {
            return idx + 1;
        }

    }

    public Node reverse(Node head) {
        if (head == null) {
            System.out.println(" ll is emty");
            return null;
        }
        if (head.next == null) {
            return head;
        }
        tail = head;
        Node pre = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
    public void removeNthNodeFromLast(int n){
        if(n >= size){
            System.out.println("out of index");
            return;
        }
        if(head == null){
            System.out.println("LL is emlty");
            return;
        }
        int count = 0;
        Node temp = head;
        Node pre = temp;
        while(count != size-1-n){
            temp = temp.next;
            count++;
            pre = temp;
        }
        tail = pre;
        temp.next = temp.next.next;
        size--;
    }
    public Node middle(){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // public boolean isPalindrom(){
    //     if(head == null || head.next == null){
    //         return true;
    //     }
    //     Node mid = middle();
    //     Node right = mid.next;
    //     mid.next = null;
    //     Node temphead = reverse(right);
    //     Node curr = head;
    //     while(temphead != null){
    //         if(curr.data != temphead.data){
    //             return false;
    //         }
    //         curr = curr.next;
    //         temphead = temphead.next;
    //     }
    //     return true;

    // }
    public boolean isCycle(){
        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while(fast.next != null && fast != null){
            slow =slow.next;
            fast =fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;

    }
    public static void removeCycle(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        
        Node slow = head;
        Node fast = head;
        Boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        Node pre = null;
        while(slow != fast){
            pre = fast;
            slow = slow.next;
            fast =fast.next;
        }
        pre.next = null;
        

    }
    
    public static void main(String args[]) {
    
    
    
    


    }
}
