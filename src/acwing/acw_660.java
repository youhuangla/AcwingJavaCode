package acwing;

import java.util.Scanner;

public class acw_660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double price = 0;
        if (x == 1) {
            price = y * 4;
        } else if (x == 2) {
            price = y * 4.5;
        } else if (x == 3) {
            price = y * 5;
        } else if (x == 4) {
            price = y * 2;
        } else if (x == 5) {
            price = y * 1.5;
        }
        System.out.printf("Total: R$ %.2f", price);
    }
}
