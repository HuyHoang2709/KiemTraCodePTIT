import java.util.*;

public class BaiTap6 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (check(s)) {
                if (mp.containsKey(s)) {
                    mp.put(s, mp.get(s) + 1);
                } else {
                    mp.put(s, 1);
                    a.add(s);
                }
            }
        }
        a.sort((s1, s2) -> mp.get(s2) - mp.get(s1));
        for (String s : a) {
            System.out.println(s + " " + mp.get(s));
        }
    }
}
