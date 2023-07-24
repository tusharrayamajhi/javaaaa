
public class hello {
    
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int sr = 0;
        int er = arr.length;
        int sc = 0;
        int ec = arr[0].length;
        while(sr<=er && sc < ec){
            for(int i =0;i<er;i++){
                System.out.println(arr[i][sc]);
            }
        }
    }
}