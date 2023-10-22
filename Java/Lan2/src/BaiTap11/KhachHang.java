package BaiTap11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang implements Comparable<KhachHang> {
    private String ma, ten, diaChi, maHang, ngayMua, ngayHetHan;
    private long slMua, thanhTien;

    public KhachHang(int x, String ten, String diaChi, String maHang, long slMua, String ngayMua) {
        this.ma = String.format("KH%02d", x);
        this.ten = ten;
        this.diaChi = diaChi;
        this.maHang = maHang;
        this.ngayMua = ngayMua;
        this.slMua = slMua;
    }

    public String getMaHang() {
        return maHang;
    }

    public static String res(String s, long t) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(s, dtf);
        LocalDate newDate = date.plusMonths(t);
        return newDate.format(dtf);
    }

    public void solve(String ma, long giaBan, long tgBaoHanh) {
        this.thanhTien = slMua * giaBan;
        this.ngayHetHan = res(this.ngayMua, tgBaoHanh);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diaChi + " " + maHang + " " + thanhTien + " " + ngayHetHan;
    }

    @Override
    public int compareTo(KhachHang o) {
        String a = ngayHetHan.trim();
        String b = o.ngayHetHan.trim();
        String[] c = a.split("/");
        String[] d = b.split("/");
        int c0 = Integer.parseInt(c[0]), c1 = Integer.parseInt(c[1]), c2 = Integer.parseInt(c[2]);
        int d0 = Integer.parseInt(d[0]), d1 = Integer.parseInt(d[1]), d2 = Integer.parseInt(d[2]);
        if (c2 != d2) return c2 - d2;
        else if (c1 != d1) return c1 - d1;
        else if (c0 != d0) return c0 - d0;
        return ma.compareTo(o.ma);
    }
}
