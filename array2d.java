public class array2d {
    public static void spiral(int arr[][]) {
        int sr = 0;
        int er = arr.length - 1;
        int sc = 0;
        int ec = arr[0].length - 1;
        while (sc <= ec && sr <= er) {

            // up
            for (int i = sc; i <= ec; i++) {
                System.out.print(arr[sr][i] + " ");
            }
            // right
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }
            // bottom
            for (int i = ec - 1; i >= sc; i--) {
                if (sr == er) {
                    break;
                }
                System.out.print(arr[er][i] + " ");
            }
            // left
            for (int i = er - 1; i >= sr + 1; i--) {
                if (sc == ec) {
                    break;
                }
                System.out.print(arr[i][sc] + " ");
            }
            sc++;
            ec--;
            sr++;
            er--;
        }
    }

    public static void diagonalsum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[i][i];
        }
        int ec = arr.length - 1;
        for (int i = 0; i < arr[0].length; i++) {
            if (i != ec) {
                sum += arr[i][ec];
            }
            ec--;
        }

        System.out.println(sum);
    }
    public static void search(int arr[][],int key){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] == key){
                    System.out.println("found at=(" + i + "," + j + ")");
                    break;
                }
            }
        }
    }
    public static void search2(int arr[][],int key){
        int i = 0;
        int j = arr[0].length-1;
        while(i<=arr.length && j>=0){
            if(arr[i][j]==key){
                System.out.println("fount at = (" + i + "," + j + ")");
                break;
            }else if(key<arr[i][j]){
                    j--;
            }else{
                    i++;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        int arr2[][] = {
            {4, 2, 9},
            {1, 7, 5},
            {8, 3, 6}
        };
        System.out.println(arr[0].length);
        // spiral(arr);
        // diagonalsum(arr);
        search2(arr, 9);
        // for(int i=0;i<arr[0].length;i++){
        // for(int j = 0;j<arr.length;j++){
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
