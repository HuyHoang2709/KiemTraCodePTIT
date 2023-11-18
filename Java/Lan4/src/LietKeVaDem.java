import java.io.FileNotFoundException;
import java.util.*;

public class LietKeVaDem {
    public static boolean check(int x) {
        String s = x + "";
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) - '0') > (s.charAt(i + 1) - '0')) return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("Temp.txt"));
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        while (sc.hasNext()) {
            int x = Integer.parseInt(sc.next());
            if (check(x)) {
                a.add(x);
                if (!b.contains(x)) b.add(x);
            }
        }
        b.sort((o1, o2) -> {
            Integer a1 = Collections.frequency(a, o1);
            Integer a2 = Collections.frequency(a, o2);
            return a2.compareTo(a1);
        });
        for (int i : b) {
            System.out.println(i + " " + Collections.frequency(a, i));
        }
    }
}
