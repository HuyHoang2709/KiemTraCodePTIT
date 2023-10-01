import java.math.BigInteger;
import java.util.Scanner;

public class Bai2_TachDoiVaTinhTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (s.length() > 1) {
            BigInteger n1 = new BigInteger(s.substring(0, s.length() / 2));
            BigInteger n2 = new BigInteger(s.substring(s.length() / 2));
            BigInteger tmp = n1.add(n2);
            s = tmp.toString();
            System.out.println(s);
        }
    }
}
