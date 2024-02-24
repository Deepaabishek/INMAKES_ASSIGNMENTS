import java.util.Scanner;

public class OnlyDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = input.nextLine();

        String ans = onlyDigits(str);
        System.out.print("The digits in given string: " + ans);
        input.close();
    }

    public static String onlyDigits(String str) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                build.append(ch);
            }
        }
        return build.toString();
    }
}
