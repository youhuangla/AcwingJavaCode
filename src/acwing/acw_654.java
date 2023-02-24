package acwing;

import java.util.Scanner;

public class acw_654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hours = time / 3600;
        int minutes = time % 3600 / 60;
        int seconds = time % 3600 % 60;
        System.out.printf("%d:%d:%d", hours, minutes, seconds);
    }
}
