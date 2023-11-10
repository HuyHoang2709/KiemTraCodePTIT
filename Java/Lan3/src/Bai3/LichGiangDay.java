package Bai3;

public class LichGiangDay implements Comparable<LichGiangDay> {
    private String ma, maMon, ten, phong;
    private int ngay, kip;

    public LichGiangDay(String ma, String maMon, int ngay, int kip, String ten, String phong) {
        this.ma = ma;
        this.maMon = maMon;
        this.ten = ten;
        this.phong = phong;
        this.ngay = ngay;
        this.kip = kip;
    }

    public String getMa() {
        return ma;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getPhong() {
        return phong;
    }

    public int getNgay() {
        return ngay;
    }

    public int getKip() {
        return kip;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public int compareTo(LichGiangDay o) {
        Integer ngay1 = this.ngay;
        Integer ngay2 = o.ngay;
        Integer kip1 = this.kip;
        Integer kip2 = o.kip;
        if (!ngay1.equals(ngay2)) return ngay1.compareTo(ngay2);
        else if (!kip1.equals(kip2)) return kip1.compareTo(kip2);
        return this.ten.compareTo(o.ten);
    }
}
