package acwing;// should be deleted in ACW

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class acw_616 {// should be changed to Main in ACW
    public static void main(String[] args) {
        double distance, x1, x2, y1, y2;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        distance = sqrt(pow(x1 - x2, 2) + pow(y2 - y1, 2));
        System.out.printf("%.4f", distance);
    }
}
