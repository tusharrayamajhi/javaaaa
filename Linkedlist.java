import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

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
    public static Node head2;
    public static Node tail;
    public static int size = 0;

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

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int searchRec(int key) {
        return helper(head, key);

    }

    public void reverse() {
        Node pre = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;

    }

    public void removerNthNodeFromEnd(int i) {
        if (i == size) {
            head = head.next;
            return;
        }
        int idx = size - i;
        Node temp = head;
        int j = 1;
        while (j < idx) {
            temp = temp.next;
            j++;
        }
        temp.next = temp.next.next;
        size--;
    }

    public boolean isPalindrom() {
        if (head == null && head.next == null) {
            return true;
        }
        Node temp = head;
        int j = 0;
        while (j != size / 2) {
            temp = temp.next;
            j++;
        }
        Node pre = null;
        Node lNode;
        while (temp != null) {
            lNode = temp.next;
            temp.next = pre;
            pre = temp;
            temp = lNode;
        }
        Node c = head;
        Node d = tail;
        for (int i = 0; i < size / 2; i++) {
            if (c.data != d.data) {
                return false;
            }
        }

        return true;
    }

    public void bintodec() {
        int ans = 0;
        reverse();

        int n = size - 1;
        Node temp = head;
        while (n >= 0) {
            ans += (int) temp.data * (int) Math.pow(2, n);
            n--;
            temp = temp.next;
        }
        System.out.println(ans);
    }

    public Node reverseRecurssion(Node head) {
        if (head == null || head.next == null) {

            return head;
        }
        Node newhead = reverseRecurssion(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;

    }

    public boolean iscycleLL() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        Node temp = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            temp = fast;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }
        temp.next = null;
    }

    public Node middle(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node left, Node right) {
        Node temp = new Node(-1);
        Node curr = temp;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                curr.next = left;
                left = left.next;
                curr = curr.next;
            } else {
                curr.next = right;
                right = right.next;
                curr = curr.next;
            }
        }
        if (left != null) {
            curr.next = left;
        } else if (right != null) {
            curr.next = right;
        }
        return temp.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // mid
        Node mid = middle(head);
        // call mergesort for right and left
        Node righthead = mid.next;
        mid.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(righthead);
        // merge linkedlist
        return merge(left, right);
    }

    public int highestCommonfactor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }

    public Node addLargestCommonDividerOfTwoLL() {
        if (head.next == null) {
            return head;
        }
        Node temp = head.next;
        Node curr = head;
        while (temp != null) {
            Node fact = new Node(highestCommonfactor(temp.data, curr.data));
            fact.next = temp;
            curr.next = fact;
            temp = temp.next;
            curr = fact.next;
        }
        return head;
    }

    public Node mergeNodes() {
        int total = 0;
        Node temp = head.next;
        // head = new Node(-1);
        Node curr = head;
        while (temp != null) {
            if (temp.data == 0) {
                curr.next = new Node(total);
                curr = curr.next;
                total = 0;

            }
            total += temp.data;
            temp = temp.next;
        }
        return head.next;
    }

    public int countnode(Node head1) {
        Node temp = head1;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public Node getIntersectionNode(Node head1, Node head2) {
        int max = countnode(head1);
        int max2 = countnode(head2);
        Node chead1 = head1;
        Node chead2 = head2;
        if (max >= max2) {
            while (max != max2) {
                chead1 = chead1.next;
                max--;
            }
        } else {
            while (max2 != max) {
                chead2 = chead2.next;
                max2--;
            }
        }
        while (chead1 != null) {
            chead1 = chead1.next;
            chead2 = chead2.next;
            if (chead1 == chead2) {
                return chead1;
            }
        }
        return null;

    }

    public void deleteNnodeAfterMnode(int n, int m) {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        int count = 1;
        Node temp = head;
        while (temp != null) {
            while (count < m) {
                if (temp == null || temp.next == null) {
                    return;
                }
                temp = temp.next;
                count++;
            }
            count = 0;
            Node curr = temp.next;
            while (count < n && curr != null) {
                Node nextNode = curr.next;
                temp.next = nextNode;
                curr = nextNode;
                count++;
            }
            temp = curr;
            count = 1;

        }
    }

    public Node oddeven() {// 1=>2=>3=>4 === 2=>4=>1=>3 even => odd
        Node ceven = new Node(-1);
        Node even = ceven;
        Node codd = new Node(-1);
        Node odd = codd;
        Node curr = head;
        while (curr != null) {
            if (curr.data % 2 == 0) {
                even.next = curr;
                curr = curr.next;
                even = even.next;
            } else {
                odd.next = curr;
                curr = curr.next;
                odd = odd.next;
            }
        }
        even.next = codd.next;
        odd.next = null;
        return ceven.next;
    }

    public void swapTwoNode(int n, int m) {
        if (n == m) {
            return;
        }
        int count = 1;
        Node temp = null;
        Node temp2 = null;
        Node curr = head;
        while (curr != null) {
            if (count == n) {
                temp = curr;
            }
            if (count == m) {
                temp2 = curr;
            }
            curr = curr.next;
            count++;
        }
        curr = head;
        Node a = curr.next.next;
        count = 1;

        while (count != n - 1) {
            count++;
            curr = curr.next;
        }
        temp.next = temp2.next;
        temp2.next = a;
        curr.next = temp2;
        a.next = null;
        a.next = temp;
    }

    public static void swapNodes(Node head, int key1, int key2) {
        if (head == null || key1 == key2) {
            return; // Nothing to swap or invalid input
        }

        // Initialize pointers for the two nodes to be swapped
        Node prev1 = null, curr1 = head;
        while (curr1 != null && curr1.data != key1) {
            prev1 = curr1;
            curr1 = curr1.next;
        }

        Node prev2 = null, curr2 = head;
        while (curr2 != null && curr2.data != key2) {
            prev2 = curr2;
            curr2 = curr2.next;
        }

        // If either of the keys is not found in the list
        if (curr1 == null || curr2 == null) {
            return;
        }

        // If the first node to be swapped is not the head
        if (prev1 != null) {
            prev1.next = curr2;
        } else {
            head = curr2;
        }

        // If the second node to be swapped is not the head
        if (prev2 != null) {
            prev2.next = curr1;
        } else {
            head = curr1;
        }

        // Swap the next pointers of the two nodes
        Node temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addlast(2);
        ll.addlast(8);
        ll.addlast(9);
        ll.addlast(6);
        ll.addlast(7);
        // head2 = new Node(3);
        // head2.next = new Node(4);
        // head2.next.next = new Node(5);
        // head2.next.next.next = head.next.next;
        // Node newNode = ll.getIntersectionNode(head,head2);
        // System.out.println(newNode.data);
        // ll.deleteNnodeAfterMnode(3, 3);
        // ll.printLL();
        // head = ll.oddeven();
        // System.out.println();
        // ll.printLL();
        // System.out.println();
        // swapNodes(head, 8, 9);
        // ll.printLL();
        int count = 0;
        int n = 5;
        while(n != 0){
             int a = n|1;
            if(a != n){
                count++;
            }
            n = n >> 1;
        }
        System.out.println(2&1);
    }
}
