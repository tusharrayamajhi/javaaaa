public class kalika {
    static int n = 60;
    public static void A(){

        for(int a = 0;a<n;a++){
            for(int j = 0;j<n;j++){
                if(a >=0&&a<=n/10&&j >=0&&j<=n/10&&j>=n-n/5&&j<=n&&a>=n/3&&a<=n){
                     System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
    public static void B(){
        for(int a = 0;a<n;a++){
            for(int j = 0;j<n;j++){
                if(a >=0&&a<=1||j >=0&&j<=1||j>=n-2&&j<=n||a==4||a==5||a==8||a==9){
                     System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        }
    }
    public static void curve(){
        for(int a = 0;a<n;a++){
            for(int j = 0;j<n;j++){
                if(a >=0&&a<=n/10||j >=0&&j<=n/10||j>=n-n/5&&j<=n||a==n/3||a==n/2||a==n-n/5||a==n-n/10){
                     System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // A();
        // System.out.println();
        // B();
        curve();
        
    }
}
