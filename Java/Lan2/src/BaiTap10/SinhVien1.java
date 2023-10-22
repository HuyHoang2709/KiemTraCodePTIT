package BaiTap10;

public class SinhVien1 implements Comparable<SinhVien1> {
    private String ma, ten, lop, mail, sdt, GVHD, deTai;

    public SinhVien1(String ma, String ten, String lop, String mail, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.sdt = "0" + sdt;
    }

    public String getMa() {
        return ma;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDeTai() {
        return deTai;
    }

    public void solve(String GVHD, String deTai) {
        this.GVHD = GVHD;
        this.deTai = deTai;
    }

    @Override
    public int compareTo(SinhVien1 a) {
        return ma.compareTo(a.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + GVHD + " " + deTai + " " + sdt;
    }
}
