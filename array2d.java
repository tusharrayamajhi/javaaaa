public class array2d {
    public static void spiral(int arr[][]){
        int sr = 0;
        int er = arr.length-1;
        int sc = 0;
        int ec = arr[0].length-1;
        while(sc<=ec&&sr<=er){

        
        //up
        for(int i = sc;i<=ec;i++){
            System.out.print(arr[sr][i]+" ");
        }
        //right
        for(int i = sr + 1;i<=er;i++){
            System.out.print(arr[i][ec]+" ");
        }
        //bottom
        for(int i = ec-1;i>=sc;i--){
            if(sr==er){
                break;
            }
            System.out.print(arr[er][i]+ " ");
        }
        //left
        for(int i = er -1;i>=sr+1;i--){
            if(sc==ec){
                break;
            }
            System.out.print(arr[i][sc]+" ");
        }
        sc++;
        ec--;
        sr++;
        er--;
    }
    }
    public static void main(String[] args) {
        int arr[][]={
            {1, 2, 3},
            {5, 6, 7},
            {9,10,11},
            {12,13,14},
            {15,16,17}
            
        };
        spiral(arr);
        // for(int i=0;i<arr[0].length;i++){
        //     for(int j = 0;j<arr.length;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
