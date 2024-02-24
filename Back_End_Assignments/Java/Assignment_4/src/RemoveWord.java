import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentencs: ");
        String str = input.nextLine().strip();
        System.out.println("orginalsentence: " + str);

        String[] arr = str.split(" ");
        String ans = removeWord(arr);

        System.out.print("Word removed sentence: " + ans);
        input.close();
    }

    public static String removeWord(String[] arr) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 3) {
                continue;
            }
            build.append(arr[i]);
            if (i < arr.length - 1) {
                build.append(" ");
            }
        }

        return build.toString();
    }
}
