package Bai4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        while (m-- > 0) {
            a.add(new MonHoc(sc.next(), sc.nextLine()));
        }

        sc = new Scanner(new File("GIANGVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> b = new ArrayList<>();
        while (n-- > 0) {
            b.add(new GiangVien(sc.next(), sc.nextLine()));
        }

        sc = new Scanner(new File("GIOCHUAN.in"));
        int p = Integer.parseInt(sc.nextLine());
        ArrayList<GioChuan> c = new ArrayList<>();
        while (p-- > 0) {
            c.add(new GioChuan(sc.next(), sc.next(), Double.parseDouble(sc.next())));
        }

        for (GiangVien gv : b) {
            String maTmp = gv.getMa();
            double tong = 0;
            for (GioChuan gc : c) {
                if (maTmp.equals(gc.getMaGV())) tong += gc.getGio();
            }
            System.out.println(gv.getTen() + " " + String.format("%.2f", tong));
        }
    }
}
