package BaiTap9;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, lop, mail, sdt;

    public SinhVien(String ma, String ten, String lop, String mail, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.sdt = "0" + sdt;
    }


    @Override
    public int compareTo(SinhVien a) {
        if (!lop.equals(a.lop)) return lop.compareTo(a.lop);
        return ma.compareTo(a.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + mail + " " + sdt;
    }
}
