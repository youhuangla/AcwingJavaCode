package acwing;

import java.util.Scanner;

public class acw_737 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = sc.nextInt();
            if (x[i] <= 0) {
                x[i] = 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("X[%d] = %d\n", i, x[i]);
        }
    }
}
