import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ToArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<String> set = new HashSet<String>();

        for (int i = 0; i < 10; i++) {
            set.add(input.nextLine());
        }

        List<String> list = new ArrayList<String>();

        list = setToArrayList(set);
        System.out.println(list);
        input.close();
    }

    public static ArrayList<String> setToArrayList(Set<String> set) {
        ArrayList<String> list = new ArrayList<String>();
        // list.addAll(set);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
}
