package acwing;

import java.util.Scanner;

public class acw_743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[12][12];
        int l = sc.nextInt();
        String str = sc.next();
        //System.out.println(str);

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        //sum
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += a[l][i];
        }
        System.out.println();
        //System.out.println(sum);
        if (str.equals("S")) {// sum
            System.out.printf("%.1f", sum);
        } else if (str.equals("M")) {
            System.out.printf("%.1f", sum / 12);
        }
        // average

    }
}
