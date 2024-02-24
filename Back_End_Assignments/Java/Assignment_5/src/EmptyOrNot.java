import java.util.ArrayList;
import java.util.Scanner;

public class EmptyOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list1.add(input.nextInt());
        }

        String ans1 = isempty1(list1) ? "The given arraylist is empty" : "The given arraylist is not empty";
        String ans2 = isempty2(list2) ? "The given arraylist is empty" : "The given arraylist is not empty";

        System.out.println("list 1: " + ans1);
        System.out.println("list 2: " + ans2);
        input.close();
    }

    public static boolean isempty1(ArrayList<Integer> list1) {
        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.contains(i)) {
                count++;
            }
        }
        return (list1.size() == count);
        // return list1.isEmpty();
    }

    public static boolean isempty2(ArrayList<Integer> list2) {
        int count = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.contains(i)) {
                count++;
            }
        }
        return (list2.size() == count);
        // return list2.isEmpty();
    }
}
