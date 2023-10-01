package Bai7_DanhSachLienLac;

public class SinhVien implements Comparable<SinhVien> {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private String email;
    private String sdt;

    public SinhVien(String ma, String ten, String lop, String email, String sdt) {
        this.maSinhVien = ma;
        this.hoTen = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    public int compareTo(SinhVien a) {
        if (!this.lop.equals(a.lop)) return this.lop.compareTo(a.lop);
        return this.maSinhVien.compareTo(a.maSinhVien);
    }

    public String toString() {
        return this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + this.email + " " + this.sdt;
    }
}
