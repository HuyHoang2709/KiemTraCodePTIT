import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int tong = 0;
        while (n-- > 0) {
            int x = sc.nextInt();
            tong += x;
            a.add(x);
        }
        System.out.println(Collections.min(a));
        System.out.println(Collections.max(a));
        System.out.println(tong);
    }
}
