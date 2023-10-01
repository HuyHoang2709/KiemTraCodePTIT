import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class Bai4_DocFileNhiPhan_1 {
    public static int[] notPrime = new int[1000005];

    public static void sang() {
        notPrime[0] = notPrime[1] = 1;
        int sqr = (int) Math.sqrt(1000000);
        for (int i = 2; i <= sqr; i++) {
            if (notPrime[i] == 0) {
                for (int j = i * i; j <= 1000000; j += i) notPrime[j] = 1;
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sang();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> arr = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i : arr) {
            if (notPrime[i] == 0 && i >= 100) ts.add(i);
        }
        for (int i : ts) System.out.println(i);
    }
}
