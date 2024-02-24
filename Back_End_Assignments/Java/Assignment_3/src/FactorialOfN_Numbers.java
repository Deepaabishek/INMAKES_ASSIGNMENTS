import java.util.Scanner;

public class FactorialOfN_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();

        int ans = factorial(num);
        System.out.println(ans);

        input.close();
    }

    public static int factorial(int num) {
        int multiple = 1;

        for (int i = 1; i <= num; i++) {
            multiple *= i;
        }

        return multiple;
    }
}
