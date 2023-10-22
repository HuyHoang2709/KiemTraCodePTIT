package BaiTap12;

public class MatHang {
    private String ten, ma, dvt;
    private long mua, ban;

    public MatHang(int x, String ten, String dvt, long mua, long ban) {
        this.ma = String.format("MH%03d", x);
        this.ten = ten;
        this.dvt = dvt;
        this.mua = mua;
        this.ban = ban;
    }

    public String getTen() {
        return ten;
    }

    public String getMa() {
        return ma;
    }

    public String getDvt() {
        return dvt;
    }

    public long getMua() {
        return mua;
    }

    public long getBan() {
        return ban;
    }
}
