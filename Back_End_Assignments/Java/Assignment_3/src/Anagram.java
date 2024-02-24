import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        input.nextLine();
        System.out.print("Enter a word: ");
        String str1 = input.nextLine().toLowerCase();
        System.out.print("Enter a word: ");
        String str2 = input.nextLine().toLowerCase();

        String ans1 = numberAnagram(num1, num2) ? "The give numbers are anagram" : "The given numbers are not anagram";
        String ans2 = stringAnagram(str1, str2) ? "The give wordss are anagram" : "The given words are not anagram";
        System.out.println(ans1);
        System.out.print(ans2);
        input.close();
    }

    public static boolean numberAnagram(int num1, int num2) {
        int[] numArray1 = new int[String.valueOf(num1).length()];
        int[] numArray2 = new int[String.valueOf(num2).length()];
        int count = 0;

        int i = 0;
        while (num1 != 0) {
            int rem = num1 % 10;
            numArray1[i] = rem;
            num1 /= 10;
            i++;
        }

        int j = 0;
        while (num2 != 0) {
            int rem = num2 % 10;
            numArray2[j] = rem;
            num2 /= 10;
            j++;
        }

        Arrays.sort(numArray1);
        Arrays.sort(numArray2);

        // return Arrays.equals(numArray1, numArray2);
        for (int k = 0; k < numArray1.length; k++) {
            if (numArray1[k] == numArray2[k]) {
                count++;
            }
        }
        return (numArray1.length == count);
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
