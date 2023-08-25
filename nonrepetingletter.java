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
    public static void main(String[] args) {
        // String str = "aabccxb";
        // System.out.println(str.indexOf('b'));
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<=10;i++){
            q.add(i);
        }
        System.out.println(q.size());
        interleaftwohalfqueus(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
