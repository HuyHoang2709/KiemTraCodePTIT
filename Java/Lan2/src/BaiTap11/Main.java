package BaiTap11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int m = Integer.parseInt(sc.nextLine());
        MatHang[] a = new MatHang[m];
        for (int i = 0; i < m; i++) {
            a[i] = new MatHang(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        KhachHang[] b = new KhachHang[n];
        for (int i = 0; i < n; i++) {
            b[i] = new KhachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), sc.nextLine());
        }
        for (KhachHang kh : b) {
            for (MatHang mh : a) {
                if (kh.getMaHang().equals(mh.getMa())) {
                    kh.solve(mh.getMa(), mh.getGiaBan(), mh.getTgBaoHanh());
                    break;
                }
            }
        }
        Arrays.sort(b);
        for (KhachHang kh : b) System.out.println(kh);
    }
}
