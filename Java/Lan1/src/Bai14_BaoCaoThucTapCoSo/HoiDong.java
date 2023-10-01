package Bai14_BaoCaoThucTapCoSo;

public class HoiDong implements Comparable<HoiDong> {
    private String maSinhVien;
    private String maDeTai;
    private String maHoiDong;

    public HoiDong(String maSV, String maDT, String maHD) {
        this.maSinhVien = maSV.trim();
        this.maDeTai = maDT.trim();
        this.maHoiDong = maHD.trim();
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getMaDeTai() {
        return maDeTai;
    }

    public String getMaHoiDong() {
        return maHoiDong;
    }

    @Override
    public int compareTo(HoiDong a) {
        return this.maSinhVien.compareTo(a.maSinhVien);
    }
}
