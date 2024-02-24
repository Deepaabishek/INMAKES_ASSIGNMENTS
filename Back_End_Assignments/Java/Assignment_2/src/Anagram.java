import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str1 = input.nextLine().toLowerCase();
        System.out.print("Enter a word: ");
        String str2 = input.nextLine().toLowerCase();

        String ans = stringAnagram(str1, str2) ? "The give wordss are anagram" : "The given words are not anagram";
        System.out.println(ans);
        input.close();
    }

    public static boolean stringAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int count = 0;

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // return Arrays.equals(ch1, ch2);
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ch2[i]) {
                count++;
            }
        }
        return (ch1.length == count);
    }
}
