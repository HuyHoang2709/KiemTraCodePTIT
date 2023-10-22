import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class BaiTap5 {
    public static boolean check1(String s) {
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) return true;
        }
        return false;
    }
    public static boolean check2(String s) {
        String x = ".,!?:";
        for(char c : x.toCharArray()) {
            if(s.contains(Character.toString(c))) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> ts = new TreeSet<>();
        while(sc.hasNext()) {
            String s = sc.next();
            if(check1(s) && check2(s)) ts.add(s);
        }
        for(String s : ts) {
            System.out.println(s);
        }
    }
}
