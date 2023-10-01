import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Bai8_ThietLapDiaChiEmail_2 {
    public static String chuanHoa1(String s) {
        String[] a = s.trim().split("\\s+");
        String res = "";
        for (String str : a) res += str.toLowerCase() + " ";
        return res;
    }

    public static String chuanHoa2(String s) {
        String[] a = s.trim().split("\\s+");
        String res = a[a.length - 1];
        for (int i = 0; i <= a.length - 2; i++) res += a[i].charAt(0);
        return res;
    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        while (sc.hasNextLine()) {
            hs.add(chuanHoa1(sc.nextLine()));
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (String str : hs) {
            String s = chuanHoa2(str);
            System.out.print(s);
            if (hm.containsKey(s)) hm.put(s, hm.get(s) + 1);
            else hm.put(s, 1);
            if (hm.get(s) > 1) System.out.print(hm.get(s));
            System.out.println("@ptit.edu.vn");
        }
    }
}
