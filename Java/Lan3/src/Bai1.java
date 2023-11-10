import java.math.BigInteger;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int dem = 0;
            BigInteger NUM13 = new BigInteger("13");
            BigInteger a = new BigInteger(sc.nextLine());
            boolean ok = false;
            while (dem < 1000) {
                if (a.mod(NUM13).equals(BigInteger.ZERO)) {
                    ok = true;
                    break;
                }
                StringBuilder tmp = new StringBuilder(a.toString());
                tmp.reverse();
                BigInteger b = new BigInteger(tmp.toString());
                a = a.add(b);
                dem++;
            }
            if (ok) System.out.println(a);
            else System.out.println(-1);
        }
    }
}
