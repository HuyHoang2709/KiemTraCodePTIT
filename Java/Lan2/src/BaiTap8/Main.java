package BaiTap8;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        User[] a = new User[n];
        HashMap<String, String> hm1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            a[i] = new User(tmp[0], tmp[1]);
            hm1.put(a[i].getId(), a[i].getPw());
        }
        HashMap<String, Integer> hm2 = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            if (hm1.containsKey(tmp[0])) {
                if (hm1.get(tmp[0]).equals(tmp[1])) {
                    if (!hm2.containsKey(tmp[0])) hm2.put(tmp[0], 1);
                    else hm2.put(tmp[0], hm2.get(tmp[0]) + 1);
                }
            }
        }
        for (User u : a) {
            if (hm2.get(u.getId()) == null) System.out.print(0 + " ");
            else System.out.print(hm2.get(u.getId()) + " ");
        }
    }
}
