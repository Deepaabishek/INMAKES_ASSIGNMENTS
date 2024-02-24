import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestOfAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.print(Arrays.toString(arr));
        System.out.println("Second smallest element: " + arr[1]);
        int[] arr1 = reverseArray(arr);
        System.out.print(Arrays.toString(arr1));
        System.out.println("Third largest element: " + arr1[2]);
        input.close();
    }

    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}
