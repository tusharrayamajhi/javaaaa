import java.io.StringBufferInputStream;

public class recursion {
    public static void decresingorder(int n){//print array in decreasing order
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        decresingorder(n-1);
    }
    public static void increasingorder(int n){//print array in increasing order
        if(n==0){
            return;
        }
        increasingorder(n-1);
        System.out.print(n + " ");
    }
    public static int factorial(int n){//function caluculate a factor of a input number
        if(n==1){
            return n;
        }
        return n * factorial(n-1);
    }
    public static int sumOfNNaturalNumber(int n){//function to calculate a sum of n natural number
        if(n == 0){
            return n;
        }
        return n + sumOfNNaturalNumber(n-1);
    }
    public static int nthFiboNumber(int n){// function that print n'th fibonacci number 
        if(n == 1 || n == 0){
            return n;
        }
        return nthFiboNumber(n-1) + nthFiboNumber(n-2);
    }
    public static boolean issortedarray(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i] >= arr[i+1]){
            return false;
        }
        return issortedarray(arr, i+1);
    }
    public static int firstOccuranceInArray(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstOccuranceInArray(arr, key, i+1);
    }
    public static int lastOccuranceInArray(int arr[],int key,int i){
        if(i < 0){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstOccuranceInArray(arr, key, i-1);
    }
    public static int xpowern(int x,int n){
        if(n == 1){
            return x;
        }
        
        return xpowern(x, n-1) * x;
    }
    public static int tilingproblem(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return tilingproblem(n-1)+tilingproblem(n-2);
    }
    public static StringBuilder dublicateInString(String str,boolean arr[],StringBuilder ans,int i){
        if(i > str.length()-1){
            return ans;
        }
        char ch = str.charAt(i);
        if(arr[ch-'a'] == false){
            ans.append(ch);
            arr[ch-'a'] = true;
        }
        return dublicateInString(str, arr, ans, i+1);
        
    }
    public static int parringfriends(int n){
        if(n == 1||n==2){
            return n;
        }
        return parringfriends(n-1)+ parringfriends(n-1)*parringfriends(n-2);
    }
    public static void main(String args[]){
        // decresingorder(10);
        // increasingorder(10);
        // System.out.println(factorial(5));
        // System.out.println(sumOfNNaturalNumber(5));
        // System.out.println(nthFiboNumber(6));
        // int arr[] ={1,2,3,6,4,5,7,6};
        // System.out.println(issortedarray(arr, 0));
        // System.out.println( firstOccuranceInArray(arr, 6, 0));
        // System.out.println( lastOccuranceInArray(arr, 6, arr.length-1));
        // System.out.println(xpowern(10,2));
        // System.out.println(tilingproblem(6));
        // String str = "abcdddeffghiiijjkkklmnopppqrsttuvwwxyzz";
        // StringBuilder ans = new StringBuilder("");
        // System.out.println(dublicateInString(str, new boolean[26], ans, 0));
        System.out.println(parringfriends(3));


    }
}
