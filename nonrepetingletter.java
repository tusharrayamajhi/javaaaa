import java.util.*;
public class nonrepetingletter {
    public static void nonrepletter(String str){
        Queue<Character> q = new LinkedList<>();
        int arr[] = new int[26];
        for(int i = 0;i<str.length();i++){
            q.add(str.charAt(i));
            arr[ str.charAt(i) -'a'] = arr[ str.charAt(i) - 'a'] + 1;
            while(!q.isEmpty() && arr[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print("-1 ");
            }else{
                System.out.print(q.peek()+" ");
            }

        }
    }
    public static void interleaftwohalfqueus(Queue<Integer> q){
        Queue<Integer> q2 = new LinkedList<>();
        int size = q.size();
        for(int i = 0;i<size/2;i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < N; i++) {
            String binary = queue.remove();
            System.out.println(binary);

            queue.add(binary + "0");
            queue.add(binary + "1");
        }
    }
    public static void main(String[] args) {
        // String str = "aabccxb";
        // System.out.println(str.indexOf('b'));
        System.out.println();
    }
}
