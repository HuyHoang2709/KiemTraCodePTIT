package BaiTap10;

import java.util.ArrayList;

public class GiangVien {
    private String ten;
    private int soSV;
    private ArrayList<SinhVien2> a;

    public GiangVien(String ten, int soSV) {
        this.ten = ten;
        this.soSV = soSV;
    }

    public void setA(ArrayList<SinhVien2> a) {
        this.a = a;
    }
}
