package acwing;

import java.util.Scanner;

public class acw_813 {
    private static void print2D(int row, int col, int[][] a) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
    private static void input2D(int row, int col, int[][] a, Scanner sc) {
        //System.out.println("now input");
        //Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        int[][] a = new int[row][col];
        input2D(row, col, a, sc);
        print2D(row, col, a);
    }
}
