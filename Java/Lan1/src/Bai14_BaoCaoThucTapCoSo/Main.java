package Bai14_BaoCaoThucTapCoSo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        HashMap<String, String> hm1 = new HashMap<>();
        int n1 = Integer.parseInt(sc.nextLine());
        SinhVien[] sv = new SinhVien[n1];
        for (int i = 0; i < n1; i++) {
            sv[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            hm1.put(sv[i].getMaSinhVien(), sv[i].getHoTen());
        }

        sc = new Scanner(new File("DETAI.in"));
        int n2 = Integer.parseInt(sc.nextLine());
        DeTai[] dt = new DeTai[n2];
        HashMap<String, String> hm2 = new HashMap<>();
        for (int i = 0; i < n2; i++) {
            dt[i] = new DeTai(sc.nextLine(), sc.nextLine(), i + 1);
            hm2.put(dt[i].getMaDeTai(), dt[i].getTenDeTai() + " " + dt[i].getGiangVien());
        }

        sc = new Scanner(new File("HOIDONG.in"));
        int n3 = Integer.parseInt(sc.nextLine());
        HoiDong[] hd = new HoiDong[n3];
        TreeSet<String> ts = new TreeSet<>();
        for (int i = 0; i < n3; i++) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            hd[i] = new HoiDong(tmp[0], tmp[1], tmp[2]);
            ts.add(tmp[2]);
        }
        Arrays.sort(hd);
        for (String s : ts) {
            System.out.println("DANH SACH HOI DONG " + s.charAt(2) + ":");
            for (HoiDong i : hd) {
                if (i.getMaHoiDong().equals(s)) {
                    System.out.println(i.getMaSinhVien() + " " + hm1.get(i.getMaSinhVien()) + " " + hm2.get(i.getMaDeTai()));
                }
            }
        }
    }
}
