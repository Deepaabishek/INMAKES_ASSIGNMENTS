import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = input.nextInt();
            }
        }

        int[][] ansArray = multplicationMatrices(arr1, arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]) + " + ");
        }
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(Arrays.toString(arr2[j]) + " = ");
        }
        for (int k = 0; k < arr1.length; k++) {
            System.out.println(Arrays.toString(ansArray[k]));
        }
        input.close();
    }

    public static int[][] multplicationMatrices(int[][] arr1, int[][] arr2) {
        int[][] newArray = new int[3][3];
        for (int row = 0; row < newArray.length; row++) {
            for (int col = 0; col < newArray[row].length; col++) {
                newArray[row][col] = arr1[row][col] * arr2[row][col];
            }
        }
        return newArray;
    }
}
