package DanhSachLienLac;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, lop, email, sdt;

    public SinhVien(String ma, String ten, String lop, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email + " " + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (!lop.equals(o.lop)) return lop.compareTo(o.lop);
        return ma.compareTo(o.ma);
    }
}
