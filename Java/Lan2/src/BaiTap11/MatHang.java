package BaiTap11;

public class MatHang {
    private String ma, ten;
    private long giaBan, tgBaoHanh;

    public MatHang(String ma, String ten, long giaBan, long tgBaoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.tgBaoHanh = tgBaoHanh;
    }

    public String getMa() {
        return ma;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public long getTgBaoHanh() {
        return tgBaoHanh;
    }
}
