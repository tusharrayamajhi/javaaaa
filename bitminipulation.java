public class bitminipulation{
    public static void evenorodd(int n){
        System.out.println((n&1)==0?"even":"odd");
    }
    public static int getithbit(int n,int i){// funciton to get i'th bit eg 101 if i == 2; ans = 1
        return (n&(1<<i))==0?0:1;
    }
    public static int setbit(int n,int i){//function to set a bit to 1 eg:- 101 if i == 1 ans = 111;
        return (n|(1<<i));
    }
    public static int clearbit(int n,int i){//function to clear a bit means to set a bit to 0 eg 101 it i == 2; ans = 001;
        return (n&~(1<<i));
    }
    public static int clearLastIthBit(int n, int i){//function to clear last i bit eg 101 if i == 2; ans = 100 which is 4;
        return (n&((-1)<<i));
    }
    public static int clearinrange(int n,int start,int end){
        if (start < 0 || end < start || end >= 32) {
            throw new IllegalArgumentException("Invalid range");
        }
        int mask = ((1 << (end - start + 1)) - 1) << start;
        return n & ~mask;
    }
    public static void main(String args[]){
        int a = 5;
        int b = 6;
        // System.out.println(a&b);//biwise and operator
        // System.out.println(a|b);//biwise or operator
        // System.out.println(a^b);//bitwise xor operator
        // System.out.println(~5);
        /*
        bitwise not operator
        5 = 0000101
        ~5= 1111010
        find 2's complement of 1111010
                1's complement=0000101
                               =    +1
                              =0000110=(-6) we put - in after find 2's complement   
        */
        // System.out.println(a<<2);//left shift operator
        // System.out.println(b>>2);//right shift opertor
        // evenorodd(6); 
        // System.out.println(setbit(a, 1));
        System.err.println(clearinrange(234, 3,5));
    }
}