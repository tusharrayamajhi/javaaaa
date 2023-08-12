public class backtraking {
    public static void printf(char arr[][]) {
        System.out.println("________chess_______");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char arr[][], int row, int col) {
        // virtical
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }
        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; j--, i--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char arr[][], int row) {
        if (row == arr.length) {
            printf(arr);
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            if (isSafe(arr, row, j)) {
                arr[row][j] = 'Q';
                nQueens(arr, row + 1);
                arr[row][j] = 'X';
            }
        }

    }

    public static void printboard(int arr[][]) {
        System.out.println("________________");
        for (int i = 0; i < arr.length; i++) {
            if (i == 3 || i == 6) {
                System.out.println("________________________");
            }
            for (int j = 0; j < arr.length; j++) {
                if (j == 3 || j == 6) {
                    System.out.print(" | ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean Safe(int board[][], int row, int col, int num) {
        //column
        for(int i = 0;i<9;i++){
            if(board[i][col]==num){
                return false;
            }
        }
        
        for(int i = 0;i<9;i++){
            if(board[row][i]==num){
                return false;
            }
        }
        // 3x3 matrix
        int r = (row / 3) * 3;
        int c = (col / 3) * 3;
        for (int i = r; i <= r + 2; i++) {
            for (int j = c; j <= c + 2; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean suduko(int board[][], int row, int col) {
        if (row == 9) {
            return true;
        }
        int newrow = row;
        int newcol = col+1;
        if (col+1 == 9) {
            newrow = row + 1;
            newcol = 0;
        }
        if (board[row][col] != 0) {
             return suduko(board, newrow, newcol);
        }
        for (int n = 1; n <= 9; n++) {
            if (Safe(board, row, col, n)) {
                board[row][col] = n;
                if (suduko(board, newrow, newcol)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }
   
    public static void main(String args[]) {
        // int n = 4;
        // char arr[][]= new char[n][n];
        // for(int i = 0;i<arr.length;i++){
        // for(int j =0;j<arr.length;j++){
        // arr[i][j]='X';
        // }
        // }
        // nQueens(arr, 0);
        int arr[][] = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        };

        if(suduko(arr, 0, 0)){
            printboard(arr);
        }else{
            System.out.println("don't exist");
        }
        
       
    }
}