package Bai14_BaoCaoThucTapCoSo;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String sdt;
    private String email;

    public SinhVien(String ma, String ten, String sdt, String mail) {
        this.maSinhVien = ma.trim();
        this.hoTen = ten.trim();
        this.sdt = sdt.trim();
        this.email = mail.trim();
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }
}
