public class primeodd {
    public static void priodd(int n){
        if(n == 1){
            System.out.println("not a prime");
        }
        for(int i = 2;i<=n;i++){
            int count = 0;
            for(int j = 2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 0){
                if(i%2 != 0){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        priodd(100);
    }
}
