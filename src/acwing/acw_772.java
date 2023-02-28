package acwing;

import java.util.Scanner;

public class acw_772 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] a = new int[26];// 批量赋值？
        for (int i = 0; i < 26; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < str.length(); i++) {
           a[str.charAt(i) - 'a']++;
        }
        boolean has = false;
        for (int i = 0; i < str.length(); i++) {
            if (a[str.charAt(i) - 'a'] == 1) {
                has = true;
                System.out.println(str.charAt(i));
                return;
            }
        }
        if (has == false) {
            System.out.println("no");
        }
    }
}
