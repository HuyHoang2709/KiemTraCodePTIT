import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai3_TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            ArrayList<Character> arr = new ArrayList<>();
            int tong = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) tong += (c - '0');
                else arr.add(c);
            }
            Collections.sort(arr);
            for (char c : arr) System.out.print(c);
            System.out.println(tong);
        }
    }
}
