import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai6_TinhTongSoLong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long tong = 0;
        while (sc.hasNext()) {
            try {
                long x = Long.parseLong(sc.next());
                if (x > Integer.MAX_VALUE) tong += x;
            } catch (Exception e) {
            }
        }
        System.out.println(tong);
    }
}
