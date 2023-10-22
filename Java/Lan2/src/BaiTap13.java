import java.util.*;

public class BaiTap13 {
    public static boolean check(String s) {
        if (s.length() < 4) return false;
        if (s.charAt(s.length() - 1) == '2') return false;
        HashSet<Character> hs = new HashSet<>();
        for (char c : s.toCharArray()) {
            hs.add(c);
        }
        return hs.size() == 4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> a = new ArrayList<>();
        String s = "2357";
        Queue<String> q = new LinkedList<>();
        for (char c : s.toCharArray()) q.add(Character.toString(c));
        while (!q.isEmpty()) {
            String x = q.poll();
            if (x.length() == n) break;
            for (char y : s.toCharArray()) {
                String x1 = x + y;
                q.add(x1);
                if (check(x1)) a.add(x1);
            }
        }
        for (String x : a) System.out.println(x);
    }
}
