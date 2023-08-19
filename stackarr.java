import java.util.ArrayList;
//Stack using ArrayList
public class stackarr {
    public static class Stack<T>{
        ArrayList<T> s = new ArrayList<>();
        public void push(T data){
            s.add(data);
        }
        public boolean isEmpty(){
            if(s.size() == 0){
                return true;
            }else{
                return false;
            }
        }
        public T peek(){
            if(s.isEmpty()){
                return null;
            }
            return s.get(s.size()-1);
        }
        public T pop(){
            if(isEmpty()){
                return null;
            }
            T a = s.get(s.size()-1);
            s.remove(s.size()-1);
            return a;
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(4);
        s.push(2);
        System.out.println(s.peek() + " ");
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }    
    }
}
