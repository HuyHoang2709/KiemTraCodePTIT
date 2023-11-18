import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhepToanCoBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = Integer.parseInt(sc.nextLine());
        BigInteger tong = new BigInteger("0");
        ArrayList<BigInteger> a = new ArrayList<>();
        while (n-- > 0) {
            BigInteger tmp = new BigInteger(sc.nextLine());
            tong = tong.add(tmp);
            a.add(tmp);
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        System.out.println(a.get(a.size() - 1));
        System.out.println(tong);
    }
}
