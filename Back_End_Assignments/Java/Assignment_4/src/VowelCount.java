import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String str = input.nextLine().replace(" ", "").toLowerCase();

        int ans = vowelCount(str);
        System.out.println("Voewel COunt: " + ans);
        input.close();
    }

    public static int vowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
