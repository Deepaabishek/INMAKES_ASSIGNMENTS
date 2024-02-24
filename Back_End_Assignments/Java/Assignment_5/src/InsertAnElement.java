import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertAnElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter indexnumber to add element: ");
        int num1 = input.nextInt();
        System.out.print("Enter the element to be added: ");
        int num2 = input.nextInt();

        Integer[] newArray = addElement(arr, num1, num2);

        System.out.println("Orginal array: " + Arrays.toString(arr));
        System.out.println("Array after adding element: " + Arrays.toString(newArray));
        input.close();
    }

    public static Integer[] addElement(int[] arr, int num1, int num2) {
        // int[] newArray = new int[arr.length + 1];

        // for (int i = 0; i < num1; i++) {
        // newArray[i] = arr[i];
        // }

        // newArray[num1] = num2;

        // for (int j = num1; j < arr.length; j++) {
        // newArray[j + 1] = arr[j];
        // }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int arr1 : arr) {
            list.add(arr1);
        }
        list.add(num1, num2);
        Integer[] newArray = list.toArray(new Integer[list.size()]);
        return newArray;
    }
}
