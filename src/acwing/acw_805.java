package acwing;
import java.util.Scanner;
public class acw_805 {
    private static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.printf("%d", max(x, y));
    }
}
