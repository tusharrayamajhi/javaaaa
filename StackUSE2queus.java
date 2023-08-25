import java.util.*;
public class StackUSE2queus {
    public static class Stack{
        static Queue<Integer> q = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();
        public static boolean isEmpty(){
            return q.isEmpty();
        }
        public static void add(int data){
            while(!q.isEmpty()){
                q2.add(q.remove());
            }
            q.add(data);
            while(!q2.isEmpty()){
                q.add(q2.remove());
            }
        }
        public static int peek(){
            if(q.isEmpty()){
                return -1;
            }
            return q.peek();
        }
        public static int pop(){
            if(q.isEmpty()){
                return -1;
            }
            return q.remove();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
