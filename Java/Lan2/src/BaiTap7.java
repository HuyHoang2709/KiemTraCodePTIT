import java.util.Scanner;
import java.util.Stack;

public class BaiTap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        int[] cnt = new int[500005];
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            while (!st.isEmpty() && x > st.peek()) {
                cnt[st.pop()]--;
                ans++;
            }
            if (!st.isEmpty()) {
                if (x == st.peek()) {
                    if (st.size() > cnt[x]) ans += cnt[x] + 1;
                    else ans += cnt[x];
                } else {
                    ans++;
                }
            }
            st.push(x);
            cnt[x]++;
        }
        System.out.println(ans);
    }
}
