package ThongKeThoiGian;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class SinhVien implements Comparable<SinhVien> {
    private String ten;
    private long time;

    public SinhVien(String ten, String bd, String kt) throws ParseException {
        this.ten = ten;

        // Tinh thoi gian online
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date batDau = sdf.parse(bd);
        Date ketThuc = sdf.parse(kt);
        this.time = ChronoUnit.MINUTES.between(batDau.toInstant(), ketThuc.toInstant());
    }


    @Override
    public int compareTo(SinhVien o) {
        if(time != o.time) return (int) (o.time - time);
        return ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ten + " " + time;
    }
}
