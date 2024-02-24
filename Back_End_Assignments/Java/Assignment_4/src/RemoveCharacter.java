import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentencs: ");
        String str = input.nextLine().strip();

        System.out.println("Orginal Sentence: " + str);
        String ans = removeCharacter(str);
        System.out.print("Removed character from sentence: " + ans);
        input.close();
    }

    public static String removeCharacter(String str) {

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                continue;
            }
            build.append(str.charAt(i));
        }
        return build.toString();
    }
}
