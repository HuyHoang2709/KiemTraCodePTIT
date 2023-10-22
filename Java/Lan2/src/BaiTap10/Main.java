package BaiTap10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien1> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            a.add(new SinhVien1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("HUONGDAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        GiangVien[] b = new GiangVien[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            String res = "";
            for (int j = 0; j < tmp.length - 1; j++) res += tmp[j] + " ";
            int m = Integer.parseInt(tmp[tmp.length - 1]);
            b[i] = new GiangVien(res.trim(), m);
            ArrayList<SinhVien2> c = new ArrayList<>();
            for (int k = 0; k < m; k++) {
                String h = sc.nextLine();
                String[] h1 = h.trim().split("\\s+");
                String h2 = "";
                for (int l = 1; l < h1.length; l++) h2 += h1[l] + " ";
                c.add(new SinhVien2(h1[0].trim(), h2.trim()));
            }
            b[i].setA(c);
            for (SinhVien1 sv1 : a) {
                for (SinhVien2 sv2 : c) {
                    if (sv2.getMa().equals(sv1.getMa())) {
                        sv1.solve(res.trim(), sv2.getDeTai().trim());
                        break;
                    }
                }
            }
        }
        Collections.sort(a);
        for (SinhVien1 sv : a) {
            if (sv.getDeTai() != null) System.out.println(sv);
        }
    }
}
