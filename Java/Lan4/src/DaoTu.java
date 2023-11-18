import java.util.Scanner;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] s = sc.nextLine().split("\\s+");
            int n = s.length;
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}
