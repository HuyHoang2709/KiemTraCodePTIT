package BaiTap12;

public class HoaDon {
    private String kh, mh, ma;
    private long soLuong;

    public HoaDon(int x, String kh, String mh, long soLuong) {
        this.ma = String.format("HD%03d", x);
        this.mh = mh;
        this.kh = kh;
        this.soLuong = soLuong;
    }

    public String getKh() {
        return kh;
    }

    public String getMh() {
        return mh;
    }

    public String getMa() {
        return ma;
    }

    public long getSoLuong() {
        return soLuong;
    }
}
