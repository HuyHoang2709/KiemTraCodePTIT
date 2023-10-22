import java.util.*;

public class BaiTap15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ke = new ArrayList<>();
        int[] vao = new int[100005];
        int dinh = 0;
        HashMap<String, Integer> nameToNumber = new HashMap<>();
        int N = sc.nextInt();
        for (int i = 0; i <= 100004; i++) {
            ke.add(new ArrayList<>());
        }
        for (int i = 0; i < N; i++) {
            String s1 = sc.next(), s2 = sc.next(), s3 = sc.next();
            if (!nameToNumber.containsKey(s1)) {
                dinh++;
                nameToNumber.put(s1, dinh);
            }
            if (!nameToNumber.containsKey(s3)) {
                dinh++;
                nameToNumber.put(s3, dinh);
            }
            int numS1 = nameToNumber.get(s1), numS3 = nameToNumber.get(s3);
            if (s2.equals(">")) {
                ke.get(numS1).add(numS3);
                vao[numS3]++;
            } else {
                ke.get(numS3).add(numS1);
                vao[numS1]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= dinh; i++) {
            if (vao[i] == 0) q.add(i);
        }
        int cnt = 0;
        while (!q.isEmpty()) {
            int x = q.poll();
            cnt++;
            for (int i : ke.get(x)) {
                vao[i]--;
                if (vao[i] == 0) q.add(i);
            }
        }
        if (cnt == dinh) System.out.println("possible");
        else System.out.println("impossible");
    }
}
