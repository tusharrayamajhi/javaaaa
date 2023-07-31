public class recursion {
    public static void decresingorder(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        decresingorder(n-1);
    }
    public static void increasingorder(int n){
        if(n==0){
            return;
        }
        increasingorder(n-1);
        System.out.print(n + " ");
    }
    public static int factorial(int n){
        if(n==1){
            return n;
        }
        return n * factorial(n-1);
    }
    public static int sumOfNNaturalNumber(int n){
        if(n == 0){
            return n;
        }
        return n + sumOfNNaturalNumber(n-1);
    }
    public static int nthFiboNumber(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return nthFiboNumber(n-1) + nthFiboNumber(n-2);
    }
    public static void main(String args[]){
        // decresingorder(10);
        // increasingorder(10);
        // System.out.println(factorial(5));
        // System.out.println(sumOfNNaturalNumber(5));
        System.out.println(nthFiboNumber(6));
    }
}
