package Bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        while (n-- > 0) {
            a.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }

        sc = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<LichGiangDay> b = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            b.add(new LichGiangDay(String.format("HP%03d", i), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        String nameFind = sc.nextLine();

        Collections.sort(b);
        System.out.println("LICH GIANG DAY GIANG VIEN " + nameFind + ":");
        for (LichGiangDay lgd : b) {
            if (lgd.getTen().equals(nameFind)) {
                String ma_tmp = lgd.getMaMon();
                String ten_tmp = "";
                for (MonHoc k : a) {
                    if (k.getMa().equals(ma_tmp)) {
                        ten_tmp = k.getTen();
                        break;
                    }
                }
                String res = lgd.getMa() + " " + ten_tmp + " " + lgd.getNgay() + " " + lgd.getKip() + " " + lgd.getPhong();
                System.out.println(res);
            }
        }
    }
}
