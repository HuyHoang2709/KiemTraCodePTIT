package ToChucICPCQuocGia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Truong> t = new ArrayList<>();
        while (m-- > 0) {
            t.add(new Truong(sc.next(), sc.nextLine()));
        }

        sc = new Scanner(new File("REGISTER.in"));
        ArrayList<Doi> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String[] tmp = sc.nextLine().split("\\s+");
            String maTruong = tmp[0];
            int p = Integer.parseInt(tmp[1]);
            while (p-- > 0) {
                String truong = "";
                for (Truong i : t) {
                    if (maTruong.equals(i.getMa())) {
                        truong = i.getTen();
                        break;
                    }
                }
                ds.add(new Doi(sc.nextLine(), truong));
            }
        }

        Collections.sort(ds);
        int cnt = 1;
        for (Doi d : ds) {
            d.setMa(String.format("team%02d", cnt++));
            System.out.println(d);
        }
    }
}
