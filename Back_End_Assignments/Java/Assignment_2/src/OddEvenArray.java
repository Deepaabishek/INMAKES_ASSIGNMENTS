import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        Integer[] oddarr = oddArray(arr);
        Integer[] evenarr = evenArray(arr);
        System.out.println("Orginal array: " + Arrays.toString(arr));
        System.out.println("Odd number array: " + Arrays.toString(oddarr));
        System.out.println("Even number array: " + Arrays.toString(evenarr));
        input.close();
    }

    public static Integer[] oddArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                list.add(arr[i]);
            }
        }
        Integer[] newArray = list.toArray(new Integer[list.size()]);
        return newArray;
    }

    public static Integer[] evenArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                list.add(arr[i]);
            }
        }
        Integer[] newArray = list.toArray(new Integer[list.size()]);
        return newArray;
    }
}
