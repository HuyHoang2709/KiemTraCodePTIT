import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class Bai2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> a1 = (ArrayList<String>) in1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) in2.readObject();
        TreeSet<String> ts1 = new TreeSet<>(a1);
        TreeSet<Integer> ts2 = new TreeSet<>(a2);

        for (String s1 : ts1) {
            for (Integer s2 : ts2) {
                System.out.println(s1 + s2);
            }
        }
    }
}
