package Bai14_BaoCaoThucTapCoSo;

public class DeTai {
    private String giangVien;
    private String tenDeTai;
    private String maDeTai;

    public DeTai(String gv, String ten, int ma) {
        this.giangVien = gv.trim();
        this.tenDeTai = ten.trim();
        this.maDeTai = String.format("DT%03d", ma);
    }

    public String getGiangVien() {
        return giangVien;
    }

    public String getTenDeTai() {
        return tenDeTai;
    }

    public String getMaDeTai() {
        return maDeTai;
    }
}
