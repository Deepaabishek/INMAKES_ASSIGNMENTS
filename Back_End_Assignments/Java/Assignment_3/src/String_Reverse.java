import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = input.nextLine();
        System.out.println("Orginal String: " + str1);
        String ans = stringReverse(str1);
        System.out.println("Reversed String: " + ans);
        input.close();
    }

    public static String stringReverse(String str1) {
        char[] ch = str1.toCharArray();
        int start = 0;
        int end = str1.length() - 1;
        char temp = ' ';
        while (start < end) {
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String str2 = String.valueOf(ch);
        return str2;
    }
}