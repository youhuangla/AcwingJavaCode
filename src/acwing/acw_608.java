package acwing;

import java.util.Scanner;

public class acw_608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        for (int i = 0; i < 4; i++) {
            x[i] = sc.nextInt();
        }
        System.out.printf("DIFERENCA = %d\n", x[0] * x[1] - x[2] * x[3]);
    }
}