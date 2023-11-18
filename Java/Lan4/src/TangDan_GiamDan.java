import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TangDan_GiamDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x;
            ArrayList<Integer> chan = new ArrayList<>();
            ArrayList<Integer> le = new ArrayList<>();
            while (n-- > 0) {
                x = sc.nextInt();
                if (x % 2 == 0) {
                    if (!chan.contains(x)) chan.add(x);
                } else {
                    if (!le.contains(x)) le.add(x);
                }
            }

            Collections.sort(chan);
            le.sort(Collections.reverseOrder());
            for (int i : chan) System.out.print(i + " ");
            System.out.println();
            for (int i : le) System.out.print(i + " ");
            System.out.println();
        }
    }
}
