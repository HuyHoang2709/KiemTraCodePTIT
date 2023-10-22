package BaiTap12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String s = String.format("KH%03d", i);
            String ten = sc.nextLine(), gioi = sc.nextLine(), ns = sc.nextLine(), dc = sc.nextLine();
            hm.put(s, ten + " " + dc);
        }
        sc = new Scanner(new File("MH.in"));
        int m = sc.nextInt();
        MatHang[] a = new MatHang[m];
        for (int i = 0; i < m; i++) {
            sc.nextLine();
            a[i] = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        sc = new Scanner(new File("HD.in"));
        int p = sc.nextInt();
        HoaDon[] b = new HoaDon[p];
        for (int i = 0; i < p; i++) {
            b[i] = new HoaDon(i + 1, sc.next(), sc.next(), sc.nextInt());
        }
        for (HoaDon x : b) {
            for (MatHang y : a) {
                if (x.getMh().equals(y.getMa())) {
                    System.out.print(x.getMa() + " " + hm.get(x.getKh()) + " ");
                    System.out.println(y.getTen() + " " + y.getDvt() + " " + y.getMua() + " " + y.getBan() + " " + x.getSoLuong() + " " + x.getSoLuong() * y.getBan());
                    break;
                }
            }
        }
    }
}
