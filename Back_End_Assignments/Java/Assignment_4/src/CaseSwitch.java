import java.util.Scanner;

public class CaseSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = input.nextLine();
        System.out.println("Orginalsentence: " + str);
        String ans = caseSwitch(str);
        System.out.println("ConvertedSentence " + ans);
        input.close();
    }

    public static String caseSwitch(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        return String.valueOf(ch);
    }
}
