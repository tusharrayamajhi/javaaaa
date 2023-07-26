public class arr {
    public static void rev(int arr[]) {
        int end = arr.length - 1;
        int start = 0;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            end--;
            start++;
        }
    }

    public static void parr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void pari2(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subarray2(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxsubarray(int arr[]) {
        // brute force
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int cs = 0;
                for (int k = i; k <= j; k++) {
                    cs += arr[k];
                }
                if (cs > max) {
                    max = cs;
                }
            }
        }
        System.out.println("sum of max array= " + max);
    }

    public static void maxsubarray2(int arr[]) {
        // prefix sum
        int arr2[] = new int[arr.length];
        arr2[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr2[i] = arr2[i - 1] + arr[i];
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int cs = i == 0 ? arr2[j] : arr2[j] - arr[i - 1];
                if (max < cs) {
                    max = cs;
                }
            }

        }
        System.out.println(max);
    }

    public static boolean isneg(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return false;
            }
        }
        return true;
    }

    public static void maxsubarray3(int arr[]) {
        int cs = 0;
        int max = 0;
        if (isneg(arr)) {
            int init = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (init < arr[i]) {
                    init = arr[i];
                }
            }
            System.out.println(init);

        } else {
            for (int i = 0; i < arr.length; i++) {
                cs += arr[i];
                if (cs < 0) {
                    cs = 0;
                }
                if (cs > max) {
                    max = cs;
                }
            }
            System.out.println(max);
        }

        
    }
    public static void trappingrainwater(int height[]){
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int ans=0;
        left[0] = height[0];
        right[height.length-1]=height[height.length-1];
        for(int i = 1;i<height.length;i++){
            if(left[i-1]>height[i]){
                left[i] = left[i-1];
            }else{
                left[i] = height[i];
            }
        }
        for(int i = height.length-2;i>=0;i--){
            if(height[i] > right[i+1]){
                right[i] = height[i];
            }else{
                right[i] = right[i+1];
            }
        }
        
        for(int i = 0;i<height.length;i++){
            int leftmax = left[i];
            int rightmax = right[i];
            int m = Math.min(leftmax, rightmax);
            ans += (m-height[i]);
        }
        System.out.println(ans);
        
    }
    public static int buyansellstock(int price[]){
        int buy = Integer.MAX_VALUE;
        int total = 0;
        for(int i = 0;i<price.length;i++){
            if(buy < price[i]){
                int today = price[i] - buy;
                total = Math.max(today, total);
            }else{
                buy = price[i];
            }
        }
        return total;
    }
    public static void lineraserch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("found at index= " + i);
            }
        }
    }

    public static void binsearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                System.out.println("found at = " + mid);
            }
            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }

    public static void reverse(int arr[]) {
        int a = arr.length - 1;
        int s = 0;
        while (s < a) {
            int temp = arr[s];
            arr[s] = arr[a];
            arr[a] = temp;
            s++;
            a--;
        }
    }

    public static int binsearch(int n, int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (n == arr[mid]) {
                return mid;
            } else if (n > arr[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }

        }
        return -1;
    }

    public static void spiralmat(int[][] arr) {
        int sr = 0;
        int er = arr.length - 1;
        int sc = 0;
        int ec = arr[0].length - 1;
        while (sr <= er && sc <= ec) {
            for (int j = sc; j <= ec; j++) {
                System.out.print(arr[sr][j] + " ");
            }
            sr++;
            for (int j = sr; j <= er; j++) {
                System.out.print(arr[j][ec] + " ");
            }
            ec--;
            if (sr <= er) {
                for (int j = ec; j >= sc; j--) {

                    System.out.print(arr[er][j] + " ");
                }
                er--;
            }
            if (sc < -ec) {
                for (int j = er - 1; j >= sr + 1; j--) {
                    System.out.print(arr[j][sc] + " ");
                }
                sc++;
            }

        }
        System.out.println();
    }

    public static void pari(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + " " + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ",");
                }
                System.out.print(")");
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void maxsubarray(int arr[], int sum) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
        }
        System.out.println("(" + max + ")");
        System.out.println("(" + min + ")");

    }
    public static void main(String[] args) {
        // int arr[] = { -1, -2, -3, -4, -5, -6 };
        // rev(arr);
        // pari2(arr);
        // subarray2(arr);
        // maxsubarray3(arr);
        // lineraserch(arr, 5);
        // binsearch(arr, 5);
        // System.out.println(binsearch(2, arr));
        // int arr[][] = {
        // {1,2,3,4},
        // {5,6,7,8},
        // {9,10,11,12},
        // };
        // maxsubarray(arr,0);
        // int height[] = {4,2,8,6,3,7,5};
        // trappingrainwater(height);
        // int price[] = {7,1,5,3,6,4};
        // System.out.println(buyansellstock(price));
    }
}
