import java.util.Scanner;

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
        // vartical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == num) {
                return false;
            }
        }
        // bottom
        for (int i = row + 1; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        // left
        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == num) {
                return false;
            }
        }
        // right
        for (int i = col + 1; i < board.length; i++) {
            if (board[row][i] == num) {
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

    public static void suduko(int board[][], int row, int col) {
        if (row == board.length && col == board.length) {
            return;
        }
            for (int n =1; n <= 9; n++) {
                if (board[row][col]==0 && Safe(board, row, col, n)) {
                    board[row][col] = n;
                    suduko(board, row, col + 1);
                    suduko(board, row + 1, col);
                    
                }
            }
             
        

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
                { 0, 0, 1, 0, 7, 6, 0, 8, 9 },
                { 6, 0, 0, 1, 0, 0, 7, 0, 0 },
                { 0, 2, 0, 0, 4, 0, 3, 0, 0 },
                { 0, 6, 0, 5, 0, 0, 0, 0, 3 },
                { 1, 0, 0, 0, 6, 0, 0, 0, 0 },
                { 0, 7, 0, 8, 2, 0, 1, 0, 5 },
                { 4, 0, 0, 0, 5, 0, 0, 0, 8 },
                { 2, 0, 0, 0, 0, 3, 5, 4, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 9, 1 },
        };

        suduko(arr, 0, 0);
        printboard(arr);
    }
}