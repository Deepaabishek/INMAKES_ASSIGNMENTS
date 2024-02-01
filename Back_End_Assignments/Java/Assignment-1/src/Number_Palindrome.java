import java.util.Scanner;

public class Number_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();

        long ans = Number_Reverse.numberReverse(num);

        String ans1 = numberpalindrome(num, ans) ? "The Given "+num+ " is palindrome" : "The Given "+num+ " not a palindrome";
        System.out.println(ans1);
        input.close();
        
    }

    public static boolean numberpalindrome(long num, long ans){

        return num==ans;
    }
}
