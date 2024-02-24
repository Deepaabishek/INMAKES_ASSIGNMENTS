import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElementsInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        Integer[] newArray = removeDuplicate(arr);
        System.out.println("Arrays with duplicate elements: " + Arrays.toString(arr));
        System.out.println("Arrays without duplicate elements " + Arrays.toString(newArray));
        input.close();
    }

    public static Integer[] removeDuplicate(Integer[] arr) {

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        Integer[] newArray = set.toArray(new Integer[set.size()]);

        return newArray;
    }
}
