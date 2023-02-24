package acwing;

import java.util.Scanner;

public class acw_712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[6];
        int count = 0;
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextDouble();
            if (a[i] > 0) {
                count++;
            }
        }
        System.out.printf("%d positive numbers", count);
    }
}
