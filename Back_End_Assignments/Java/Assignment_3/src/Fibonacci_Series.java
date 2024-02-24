import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int[] ans = fibonnaciSeries(num, a, b);
        System.out.print("The series numbers are: " + Arrays.toString(ans));
        input.close();
    }

    public static int[] fibonnaciSeries(int num, int a, int b) {
        int[] numarr = new int[num];
        numarr[0] = a;
        numarr[1] = b;
        for (int i = 2; i <= num; i++) {
            int temp = b;
            b = a + b;
            a = temp;
            if (i < numarr.length) {
                numarr[i] = b;
            }
        }
        return numarr;
    }
}
