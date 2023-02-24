package acwing;

import java.util.Scanner;

public class acw_653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int []x = {100, 50, 20, 10, 5, 2, 1};
        int []y = new int[8];// money left
        int []numY = new int[8];// number of money'y'
        y[0] = z;
        System.out.println(z);
        for (int i = 0; i < 7; i++) {
            numY[i] = y[i] / x[i];//576 / 100 == 5
            y[i + 1] = y[i] % x[i];// 576 % 100 == 76
            System.out.println(numY[i] + " nota(s) de R$ " + x[i] + ",00"); //5 nota(s) de R$ 100,00
        }

        /*
        for (:
             x) {
            
        }
        */
    }
}
