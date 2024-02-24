import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }
        Integer[] arr3 = mergeArray(arr1, arr2);

        System.out.println("Array_1: " + Arrays.toString(arr1));
        System.out.println("Array_2: " + Arrays.toString(arr2));
        System.out.println("Merged_Array: " + Arrays.toString(arr3));
        input.close();
    }

    public static Integer[] mergeArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<Integer>();
        for (int a : arr1) {
            list.add(a);
        }
        for (int b : arr2) {
            list.add(b);
        }
        Integer[] newArray = list.toArray(new Integer[list.size()]);
        return newArray;
    }
}
