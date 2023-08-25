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
    public static void main(String[] args) {
        String str = "aabccxb";
        System.out.println(str.indexOf('b'));
    }
}
