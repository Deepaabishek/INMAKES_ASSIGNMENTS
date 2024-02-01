import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = input.nextInt();
        String ans = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "The given " + year + " is a leap year"
                : "The given " + year + " is not a leap year";
        System.out.println(ans);
        input.close();
    }
}
