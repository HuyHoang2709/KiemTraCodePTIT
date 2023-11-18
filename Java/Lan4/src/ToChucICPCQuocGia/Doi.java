package ToChucICPCQuocGia;

public class Doi implements Comparable<Doi> {
    private String ma, ten, truong;

    public Doi(String ten, String truong) {
        this.ten = ten.trim();
        this.truong = truong.trim();
    }

    public void setMa(String ma) {
        this.ma = ma.trim();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + truong;
    }

    @Override
    public int compareTo(Doi o) {
        if (!truong.equals(o.truong)) return truong.compareTo(o.truong);
        return ten.compareTo(o.ten);
    }
}
