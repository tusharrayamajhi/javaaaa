/**
 * starpattern
 */
public class starpattern {
    public static void starpat() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = i; j < n * 2 - i; j++) {
                System.out.print("   ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = i; j < n * 2 - i; j++) {
                System.out.print("   ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void halfPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void ch() {
        char ch = 'A';
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static int fact(int n) {
        if (n == 1) {
            return n;
        }
        return n * fact(n - 1);
    }

    public static boolean primornot(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (primornot(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void binTodec(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            int r = n % 10;
            dec = dec + r * (int) Math.pow(2, pow);
            n = n / 10;
            pow++;
        }
        System.out.println(dec);
    }

    public static void Hollowpattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || i == n || j == 0 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertrotatepyr(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == n || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void floytraipatt(int n) {
        /*
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         * 0 1 0 1 0 1
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                    ;
                }
            }
            System.out.println();
        }
    }

    public static void rhombuspatt(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamond2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    

    static int b = 6;
    static int c = 2;

    public static void myname() {
        int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < 2 || j > 3 && j < 7) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (j < 3 || j > 7 || i > 7) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 1 || i == 4 || i == 5 || i == 9 || i == 10 || (i < 5) && (j < 3)
                        || (j > 8) && (i > 4)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j < 3 || i == 4 || i == 5 || (j > 7) && (i > 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (i < 2 || j < 3 || j > 7 || i == 4 || i == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 1 || j == 0 || j == 1 || (j == 10 || j == 9) && (i < 4) || i == 4 || i == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                if (i == b && j == c) {
                    System.out.print("* ");
                    b++;
                    c++;
                }

            }
            System.out.println();
        }
    }

    
    public static void numprymid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromparttern() {
        for (int i = 1; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

   
    public static void main(String[] args) {
        // starpat();
        // halfPyramid();
        // invertrotatepyr(5);
        // floytraipatt(5);
        // rhombuspatt(5);
        // diamond2(15);
        // myname();
        // numprymid();
        // palindromparttern();
        

        
    }
}