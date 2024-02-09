import java.util.Scanner;

public class Swapping_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        System.out.println("Before swapperd: "+num1+" "+num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After swapped: "+num1+" "+num2);
        input.close();
    }
}
