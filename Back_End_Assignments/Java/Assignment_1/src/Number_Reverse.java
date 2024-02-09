import java.util.Scanner;

public class Number_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        System.out.println("Input Number: "+num);
        long ans = numberReverse(num);
        System.out.println("Reversed Number: "+ans);
        input.close();
    }

    public static long numberReverse(long num){
        long ans = 0;
            while (num > 0) {
            int rem = (int)num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
          return ans;
    }
}
