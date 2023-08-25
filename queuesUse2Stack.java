import java.util.*;
public class queuesUse2Stack {
    public static class Queues{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        }
        public static int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }
        public static int pop(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.pop();
        }
        
        
    }
    public static void main(String[] args) {
        Queues q1 = new Queues();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        System.out.println(q1.peek());
        q1.pop();
        while(!q1.isEmpty()){
            System.out.println(q1.pop());
        }
    }
}
