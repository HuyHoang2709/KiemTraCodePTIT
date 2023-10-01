import java.util.*;

public class Bai12_SapXepTheoThuTuXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            HashMap<Integer, Integer> hm = new HashMap<>();
            while (n-- > 0) {
                int x = sc.nextInt();
                if (!hm.containsKey(x)) {
                    a.add(x);
                    hm.put(x, 1);
                } else {
                    hm.put(x, hm.get(x) + 1);
                }
            }
            Collections.sort(a, new Comparator<Integer>() {
                public int compare(Integer n1, Integer n2) {
                    return hm.get(n2) - hm.get(n1);
                }
            });
            for(int i : a) {
                for(int j = 1; j <= hm.get(i); j++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
