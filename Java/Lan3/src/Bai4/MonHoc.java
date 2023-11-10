package Bai4;

public class MonHoc {
    private String ma, ten;

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public MonHoc(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String toString() {
        return ma + ten;
    }
}
