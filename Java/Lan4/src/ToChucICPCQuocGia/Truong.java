package ToChucICPCQuocGia;

public class Truong {
    private String ma, ten;

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public Truong(String ma, String ten) {
        this.ma = ma.trim();
        this.ten = ten.trim();
    }
}
