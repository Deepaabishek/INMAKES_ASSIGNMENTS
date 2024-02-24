import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveAnElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer[] arr = new Integer[5];
        System.out.print("Enter the indexnumber to remove: ");
        int num = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("OrginalArray: " + Arrays.toString(arr));
        Integer[] arr1 = removeElement(arr, num);
        System.out.println("Removed element array: " + (Arrays.toString(arr1)));
        input.close();
    }

    public static Integer[] removeElement(Integer[] arr, int num) {

        // for (int i = num; i < arr.length - 1; i++) {
        // arr[i] = arr[i + 1];
        // }

        // int[] newArray = new int[arr.length - 1];
        // for (int j = 0; j < newArray.length; j++) {
        // newArray[j] = arr[j];
        // }
        // return newArray;

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList((arr)));
        list.remove(num);

        Integer[] newArray = list.toArray(new Integer[list.size()]);
        return newArray;
    }
}
