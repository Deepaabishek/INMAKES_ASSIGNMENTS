import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int ans = sumOfDigits(num);
        System.out.println("The sum of given digit is " + ans);

        input.close();
    }

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        return sum;
    }
}
