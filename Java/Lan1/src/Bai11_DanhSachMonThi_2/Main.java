package Bai11_DanhSachMonThi_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashSet<String> hs = new HashSet<>();
        ArrayList<MonHoc> ds = new ArrayList<>();
        while (sc.hasNextLine()) {
            MonHoc m = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if (!hs.contains(m.getMaMon())) ds.add(m);
            hs.add(m.getMaMon());
        }
        Collections.sort(ds);
        for(MonHoc m : ds) {
            System.out.println(m);
        }
    }
}
