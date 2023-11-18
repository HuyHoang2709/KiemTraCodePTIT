import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChuSoNguyenTo {
    static int n;
    static int x;
    static int[] a = new int[15];
    static int[] b = {2, 3, 5, 7};

    public static void in() {
        if (a[x] != 2) {
            int[] cnt = new int[10];
            for (int i : a) {
                cnt[i]++;
            }
            if (cnt[2] * cnt[3] * cnt[5] * cnt[7] != 0) {
                for (int i = 1; i <= x; i++) {
                    System.out.print(a[i]);
                }
                System.out.println();
            }
        }
    }

    public static void Try(int i) {
        for (int j : b) {
            a[i] = j;
            if (i == x) in();
            else Try(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = 4;
        while (x <= n) {
            Try(1);
            x++;
        }
    }
}
