import java.util.Stack;

import javax.swing.plaf.nimbus.State;

public class stackQNS {
    public static void pushAtButtom(int n,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int temp = s.pop();
        pushAtButtom(n, s);
        s.push(temp);
    }
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i != str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sc = new StringBuilder("");
        while(!s.isEmpty()){
            sc.append(s.pop());
        }
        return sc.toString();
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverseStack(s);
        pushAtButtom(temp, s);
    }
    public static int[] nextGreaterSpan(int arr[]){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int span[] = new int[arr.length];
        span[0] = 1;
        for(int i = 1;i<arr.length;i++){
            while(arr[i] > arr[s.peek()] && !s.isEmpty()){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = 1 + i;
            }else{
                span[i] = i - s.peek();
            }
            s.push(i);
        }
        return span;
    }
    public static int[] nextGreaterElement(int arr[]){
        int great[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        great[arr.length-1] = -1;
        s.push(arr.length-1);
        for(int i = arr.length-2;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] < arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                great[i] = -1;
            }else{
                great[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return great;

    }
    public static boolean validParenthess(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                s.push(str.charAt(i));
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((str.charAt(i) == ')' && s.peek() == '(') || (str.charAt(i) == '}' && s.peek() == '{' || (str.charAt(i) == ']' && s.peek() == '[') )){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isDublicatepar(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static int largestAreaInHistogram(int arr[]){
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        
    }
    public static void main(String[] args) {
       String str = "(a)()";
       System.out.println(isDublicatepar(str));
        
    }
}
