import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class BaiTap4 {
    public static boolean check(int x) {
        String s = x + "";
        if (s.length() < 2) return false;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) - '0' > s.charAt(i) - '0') return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) in2.readObject();
        int[] cnt1 = new int[100005];
        int[] cnt2 = new int[100005];
        for (int i : a1) {
            if (check(i)) cnt1[i]++;
        }
        for (int i : a2) {
            if (check(i)) cnt2[i]++;
        }
        for (int i = 10; i <= 9999; i++) {
            if (cnt1[i] > 0 && cnt2[i] > 0) {
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        }
    }
}
