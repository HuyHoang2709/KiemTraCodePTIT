package Bai4;

public class GioChuan {
    private String maGV, maMon;
    private double gio;

    public String getMaGV() {
        return maGV;
    }

    public String getMaMon() {
        return maMon;
    }

    public double getGio() {
        return gio;
    }

    public GioChuan(String maGV, String maMon, double gio) {
        this.maGV = maGV;
        this.maMon = maMon;
        this.gio = gio;
    }
}
