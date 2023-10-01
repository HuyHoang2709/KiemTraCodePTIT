import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class Bai10_GhepMa {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> arr1 = (ArrayList<String>) in1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();
        TreeSet<String> ts = new TreeSet<>();
        for (String str : arr1) {
            for (int i : arr2) {
                String tmp = str + (i + "");
                ts.add(tmp);
            }
        }
        for (String str : ts) {
            System.out.println(str);
        }
    }
}
