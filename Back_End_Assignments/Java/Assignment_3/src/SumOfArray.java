import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers with space: ");
        int[] numarr = new int[10];

        for (int i = 0; i < numarr.length; i++) {
            numarr[i] = input.nextInt();
        }

        int ans = sumOfArray(numarr);
        System.out.println("The sum of given array: " + ans);

        input.close();
    }

    public static int sumOfArray(int[] numarr) {
        int sum = 0;
        for (int i = 0; i < numarr.length; i++) {
            sum += numarr[i];
        }
        return sum;
    }
}
