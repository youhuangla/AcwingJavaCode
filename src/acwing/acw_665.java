package acwing;

import java.util.Scanner;

public class acw_665 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean bei = true;
        if (a > b) {
            if (a % b == 0) {
                bei = true;
            } else {
                bei = false;
            }
        } else {
            if (b % a == 0) {
                bei = true;
            } else {
                bei = false;
            }
        }
        if (bei == true) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
