import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Bai5_KiemTraChiaHet {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int t = Integer.parseInt(sc.nextLine());
        BigInteger NUM7 = new BigInteger("7");
        BigInteger NUM13 = new BigInteger("13");
        while (t-- > 0) {
            BigInteger n = new BigInteger(sc.nextLine());
            int dem = 0;
            if (n.mod(NUM7).equals(BigInteger.ZERO)) dem += 7;
            if (n.mod(NUM13).equals(BigInteger.ZERO)) dem += 13;

            if (dem == 0) System.out.println("None");
            else if (dem == 7) System.out.println("Div 7");
            else if (dem == 13) System.out.println("Div 13");
            else System.out.println("Both");
        }
    }
}
