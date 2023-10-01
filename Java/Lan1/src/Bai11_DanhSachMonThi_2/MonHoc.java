package Bai11_DanhSachMonThi_2;

public class MonHoc implements Comparable<MonHoc> {
    private String maMon;
    private String tenMon;
    private String hinhThucThi;

    public MonHoc(String ma, String ten, String thi) {
        this.maMon = ma;
        this.tenMon = ten;
        this.hinhThucThi = thi;
    }

    public String getMaMon() {
        return this.maMon;
    }

    public String toString() {
        return this.maMon + " " + this.tenMon + " " + this.hinhThucThi;
    }

    public int compareTo(MonHoc a) {
        return this.maMon.compareTo(a.maMon);
    }
}
